package school.sptech.projetoindividual.tabelas;

public class Ataque {

    /*id INT PRIMARY KEY AUTO_INCREMENT,
    agente_id INT NOT NULL,
    arma_id INT DEFAULT NULL,
    nome VARCHAR(100) NOT NULL,
    tipo_ataque ENUM('corpo_a_corpo', 'distancia', 'desarmado', 'especial') DEFAULT 'corpo_a_corpo',
    atributo_utilizado INT NOT NULL,
    descricao TEXT,
    bonus_ataque_extra INT DEFAULT 0,
    bonus_dano_extra INT DEFAULT 0,
    eh_critico_automatico BOOLEAN DEFAULT FALSE,
    FOREIGN KEY (agente_id) REFERENCES agente(id) ON DELETE CASCADE,
    FOREIGN KEY (arma_id) REFERENCES arma(id) ON DELETE SET NULL,
    FOREIGN KEY (atributo_utilizado) REFERENCES atributos(id)*/

    private Integer id;
    private Integer armaId;
    private String nome;
    private String tipoAtaque;
    private Integer atributoUtilizado;
    private String descricao;
    private Integer bonusAtaqueExtra;
    private Integer bonusDanoExtra;
    private Boolean ehCriticoAutomatico;

    public Ataque(Integer id, Integer armaId, String nome, String tipoAtaque, Integer atributoUtilizado, String descricao, Integer bonusAtaqueExtra, Integer bonusDanoExtra, Boolean ehCriticoAutomatico) {
        this.id = id;
        this.armaId = armaId;
        this.nome = nome;
        this.tipoAtaque = tipoAtaque;
        this.atributoUtilizado = atributoUtilizado;
        this.descricao = descricao;
        this.bonusAtaqueExtra = bonusAtaqueExtra;
        this.bonusDanoExtra = bonusDanoExtra;
        this.ehCriticoAutomatico = ehCriticoAutomatico;
    }

    public Ataque() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getArmaId() {
        return armaId;
    }

    public void setArmaId(Integer armaId) {
        this.armaId = armaId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoAtaque() {
        return tipoAtaque;
    }

    public void setTipoAtaque(String tipoAtaque) {
        this.tipoAtaque = tipoAtaque;
    }

    public Integer getAtributoUtilizado() {
        return atributoUtilizado;
    }

    public void setAtributoUtilizado(Integer atributoUtilizado) {
        this.atributoUtilizado = atributoUtilizado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getBonusAtaqueExtra() {
        return bonusAtaqueExtra;
    }

    public void setBonusAtaqueExtra(Integer bonusAtaqueExtra) {
        this.bonusAtaqueExtra = bonusAtaqueExtra;
    }

    public Integer getBonusDanoExtra() {
        return bonusDanoExtra;
    }

    public void setBonusDanoExtra(Integer bonusDanoExtra) {
        this.bonusDanoExtra = bonusDanoExtra;
    }

    public Boolean getEhCriticoAutomatico() {
        return ehCriticoAutomatico;
    }

    public void setEhCriticoAutomatico(Boolean ehCriticoAutomatico) {
        this.ehCriticoAutomatico = ehCriticoAutomatico;
    }
}
