package school.sptech.projetoindividual.tabelas;

public class HabilidadeTrilha {

    /*id INT PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(50),
    descricao TEXT,
    trilha_id INT,
    FOREIGN KEY (trilha_id) REFERENCES trilha(id)*/

    private Integer id;
    private String titulo;
    private String descricao;
    private Integer trilhaId;

    public HabilidadeTrilha(Integer id, String titulo, String descricao, Integer trilhaId) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.trilhaId = trilhaId;
    }

    public HabilidadeTrilha() {
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

    public Integer getTrilhaId() {
        return trilhaId;
    }

    public void setTrilhaId(Integer trilhaId) {
        this.trilhaId = trilhaId;
    }
}
