package school.sptech.projetoindividual.tabelas;

public class Classe {

    /*id INT PRIMARY KEY AUTO_INCREMENT,
    nome_classe VARCHAR(50) NOT NULL,  -- Combatente, Especialista, Ocultista, Mundano
    descricao TEXT,
    caracteristica INT,
    FOREIGN KEY (caracteristica) REFERENCES caracteristicaClasse(id)*/

    private Integer id;
    private String nomeClasse;
    private String descricao;
    private Integer caracteristica;

    public Classe(Integer id, String nomeClasse, String descricao, Integer caracteristica) {
        this.id = id;
        this.nomeClasse = nomeClasse;
        this.descricao = descricao;
        this.caracteristica = caracteristica;
    }

    public Classe() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeClasse() {
        return nomeClasse;
    }

    public void setNomeClasse(String nomeClasse) {
        this.nomeClasse = nomeClasse;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(Integer caracteristica) {
        this.caracteristica = caracteristica;
    }
}
