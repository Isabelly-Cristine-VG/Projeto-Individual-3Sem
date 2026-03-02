package school.sptech.projetoindividual.tabelas;

public class HabilidadeOrigem {

    /*id INT PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(50),
    descricao TEXT*/

    private Integer id;
    private String titulo;
    private String descricao;

    public HabilidadeOrigem(Integer id, String titulo, String descricao) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public HabilidadeOrigem() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
