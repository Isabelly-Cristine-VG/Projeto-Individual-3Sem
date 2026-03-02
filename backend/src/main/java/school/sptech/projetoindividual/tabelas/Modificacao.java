package school.sptech.projetoindividual.tabelas;

public class Modificacao {

    /*id INT PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(100),
    descricao TEXT,
    bonus_dano INT DEFAULT 0,
    bonus_outro VARCHAR(100)*/

    private Integer id;
    private String titulo;
    private String descricao;
    private Integer bonusDano;
    private String bonusOutro;

    public Modificacao(Integer id, String titulo, String descricao, Integer bonusDano, String bonusOutro) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.bonusDano = bonusDano;
        this.bonusOutro = bonusOutro;
    }

    public Modificacao() {}

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

    public Integer getBonusDano() {
        return bonusDano;
    }

    public void setBonusDano(Integer bonusDano) {
        this.bonusDano = bonusDano;
    }

    public String getBonusOutro() {
        return bonusOutro;
    }

    public void setBonusOutro(String bonusOutro) {
        this.bonusOutro = bonusOutro;
    }
}
