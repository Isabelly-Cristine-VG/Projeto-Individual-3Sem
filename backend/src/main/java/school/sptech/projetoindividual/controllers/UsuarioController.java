package school.sptech.projetoindividual.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import school.sptech.projetoindividual.tabelas.Usuario;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final JdbcTemplate jdbcTemplate;
    public UsuarioController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @PostMapping
    public ResponseEntity<Usuario> cadastrarUsuario(@RequestBody Usuario usuario){
        String sqlSelect = "select * from usuario where nome_usuario = ?;";

        List<Usuario> usuarios = jdbcTemplate.query(sqlSelect,
                new BeanPropertyRowMapper<Usuario>(Usuario.class), usuario.getNomeUsuario());

        if (!usuarios.isEmpty()){
            return ResponseEntity.status(409).build();
        }
        if (usuario.getNomeUsuario().trim().isEmpty() || usuario.getNomeUsuario() == null ||
                usuario.getEmail().trim().isEmpty() || usuario.getEmail() == null ||
                usuario.getSenhaHash() == null || usuario.getSenhaHash() == null){
            return ResponseEntity.status(400).build();
        }

        String sql = """
    INSERT INTO usuario (nome_usuario, email, senha_hash, data_criacao)
    VALUES (?, ?, ?, ?)
    """;

        KeyHolder keyHolder = new GeneratedKeyHolder();

        int rowsAffected = jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, usuario.getNomeUsuario());
            ps.setString(2, usuario.getEmail());
            ps.setString(3, usuario.getSenhaHash());
            ps.setObject(4, usuario.getDataCriacao());          // opção moderna
            // ou: ps.setDate(4, java.sql.Date.valueOf(usuario.getDataCriacao())); // opção segura/compatível
            return ps;
        }, keyHolder);

        if (rowsAffected == 0) {
            throw new RuntimeException("Falha ao inserir usuário");
        }

// Pega o ID gerado (funciona para a maioria dos bancos)
        Integer idGerado = keyHolder.getKey().intValue();
        usuario.setId(idGerado);

        return ResponseEntity.status(201).body(usuario);
    }
}
