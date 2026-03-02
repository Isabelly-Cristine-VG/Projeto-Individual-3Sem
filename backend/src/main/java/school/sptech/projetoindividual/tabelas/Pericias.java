package school.sptech.projetoindividual.tabelas;

public class Pericias {

    /*id INT PRIMARY KEY AUTO_INCREMENT,
    nome_pericia VARCHAR(50) UNIQUE NOT NULL,
    descricao TEXT,
    atributo_utilizado INT,
    FOREIGN KEY (atributo_utilizado) REFERENCES atributos(id)*/

    private Integer id;
    private String nomePericia;
    private String descricao;
    private Integer atributoUtilizado;

    public Pericias(Integer id, String nomePericia, String descricao, Integer atributoUtilizado) {
        this.id = id;
        this.nomePericia = nomePericia;
        this.descricao = descricao;
        this.atributoUtilizado = atributoUtilizado;
    }

    public Pericias() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomePericia() {
        return nomePericia;
    }

    public void setNomePericia(String nomePericia) {
        this.nomePericia = nomePericia;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getAtributoUtilizado() {
        return atributoUtilizado;
    }

    public void setAtributoUtilizado(Integer atributoUtilizado) {
        this.atributoUtilizado = atributoUtilizado;
    }
}
