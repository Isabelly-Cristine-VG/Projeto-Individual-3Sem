package school.sptech.projetoindividual.tabelas;

public class AgentePericia {

    /*agente_id INT,
    pericia_id INT,
    treino INT DEFAULT 0,
    bonus_outros INT DEFAULT 0,
    PRIMARY KEY (agente_id, pericia_id),
    FOREIGN KEY (agente_id) REFERENCES agente(id),
    FOREIGN KEY (pericia_id) REFERENCES pericias(id)*/

    private Integer agenteId;
    private Integer periciaId;
    private Integer treino;
    private Integer bonusOutros;

    public AgentePericia(Integer agenteId, Integer periciaId, Integer treino, Integer bonusOutros) {
        this.agenteId = agenteId;
        this.periciaId = periciaId;
        this.treino = treino;
        this.bonusOutros = bonusOutros;
    }

    public AgentePericia() {
    }

    public Integer getAgenteId() {
        return agenteId;
    }

    public void setAgenteId(Integer agenteId) {
        this.agenteId = agenteId;
    }

    public Integer getPericiaId() {
        return periciaId;
    }

    public void setPericiaId(Integer periciaId) {
        this.periciaId = periciaId;
    }

    public Integer getTreino() {
        return treino;
    }

    public void setTreino(Integer treino) {
        this.treino = treino;
    }

    public Integer getBonusOutros() {
        return bonusOutros;
    }

    public void setBonusOutros(Integer bonusOutros) {
        this.bonusOutros = bonusOutros;
    }
}
