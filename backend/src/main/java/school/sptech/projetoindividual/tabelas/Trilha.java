package school.sptech.projetoindividual.tabelas;

public class Trilha {

    /*id INT PRIMARY KEY AUTO_INCREMENT,
    titulo_trilha VARCHAR(50),
    descricao TEXT,
    classe_id INT,
    FOREIGN KEY (classe_id) REFERENCES classe(id)*/

    private Integer id;
    private String tituloTrilha;
    private String descricao;
    private Integer classeId;

    public Trilha(Integer id, String tituloTrilha, String descricao, Integer classeId) {
        this.id = id;
        this.tituloTrilha = tituloTrilha;
        this.descricao = descricao;
        this.classeId = classeId;
    }

    public Trilha() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTituloTrilha() {
        return tituloTrilha;
    }

    public void setTituloTrilha(String tituloTrilha) {
        this.tituloTrilha = tituloTrilha;
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
