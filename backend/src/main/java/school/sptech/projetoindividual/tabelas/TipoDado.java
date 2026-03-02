package school.sptech.projetoindividual.tabelas;

public class TipoDado {

    /*id INT PRIMARY KEY AUTO_INCREMENT,
    faces INT UNIQUE NOT NULL,
    nome VARCHAR(10)                  -- d4, d6, d8, d10, d12, d20*/

    private Integer id;
    private String faces;
    private String nome;

    public TipoDado(Integer id, String faces, String nome) {
        this.id = id;
        this.faces = faces;
        this.nome = nome;
    }

    public TipoDado() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFaces() {
        return faces;
    }

    public void setFaces(String faces) {
        this.faces = faces;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
