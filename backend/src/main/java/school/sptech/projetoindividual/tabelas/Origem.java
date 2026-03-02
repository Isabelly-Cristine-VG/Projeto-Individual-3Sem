package school.sptech.projetoindividual.tabelas;

public class Origem {

    /*id INT PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(70),
    descricao TEXT,
    habilidade INT UNIQUE,
    FOREIGN KEY (habilidade) REFERENCES habilidadeOrigem(id)*/

    private Integer id;
    private String titulo;
    private String descricao;
    private Integer habilidade;

    public Origem(Integer id, String titulo, String descricao, Integer habilidade) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.habilidade = habilidade;
    }

    public Origem() {
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

    public Integer getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(Integer habilidade) {
        this.habilidade = habilidade;
    }
}
