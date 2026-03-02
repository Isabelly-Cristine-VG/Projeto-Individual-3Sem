package school.sptech.projetoindividual.tabelas;

public class TipoItem {

    /*id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(55) NOT NULL*/

    private Integer id;
    private String nome;

    public TipoItem(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public TipoItem() {
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
