package school.sptech.projetoindividual.tabelas;

public class HabilidadeClasse {

    /*id INT PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(50),
    descricao TEXT,
    classe_id INT,
    FOREIGN KEY (classe_id) REFERENCES classe(id)*/

    private Integer id;
    private String titulo;
    private String descricao;
    private Integer classeId;

    public HabilidadeClasse(Integer id, String titulo, String descricao, Integer classeId) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.classeId = classeId;
    }

    public HabilidadeClasse() {
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

    public Integer getClasseId() {
        return classeId;
    }

    public void setClasseId(Integer classeId) {
        this.classeId = classeId;
    }
}
