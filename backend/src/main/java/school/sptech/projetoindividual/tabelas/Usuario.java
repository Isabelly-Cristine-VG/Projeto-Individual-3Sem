package school.sptech.projetoindividual.tabelas;

import java.time.LocalDate;

public class Usuario {
    /*id INT PRIMARY KEY AUTO_INCREMENT,
    nome_usuario VARCHAR(100) UNIQUE NOT NULL,
    email VARCHAR(150) UNIQUE NOT NULL,
    senha_hash VARCHAR(255),
    data_criacao DATETIME DEFAULT CURRENT_TIMESTAMP

     */

    private Integer id;
    private String nomeUsuario;
    private String email;
    private String senhaHash;
    private LocalDate dataCriacao;

    public Usuario(Integer id, String nomeUsuario, String email, String senhaHash, LocalDate dataCriacao) {
        this.id = id;
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.senhaHash = senhaHash;
        this.dataCriacao = dataCriacao;
    }

    public Usuario() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenhaHash() {
        return senhaHash;
    }

    public void setSenhaHash(String senhaHash) {
        this.senhaHash = senhaHash;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}
