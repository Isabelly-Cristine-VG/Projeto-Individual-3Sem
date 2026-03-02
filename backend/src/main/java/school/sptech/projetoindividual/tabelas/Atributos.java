package school.sptech.projetoindividual.tabelas;

public class Atributos {

    /*id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(45) UNIQUE NOT NULL  -- Agilidade, Força, Intelecto, Presença, Vigor*/

    private Integer id;
    private String nome;

    public Atributos(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Atributos() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
