package school.sptech.projetoindividual.tabelas;

public class AgenteHabilidade {

    /*agente_id INT,
    habilidade_id INT,
    nivel INT DEFAULT 1,
    PRIMARY KEY (agente_id, habilidade_id),
    FOREIGN KEY (agente_id) REFERENCES agente(id),
    FOREIGN KEY (habilidade_id) REFERENCES habilidade(id)*/

    private Integer agenteId;
    private Integer habilidadeId;
    private Integer nivel;

    public AgenteHabilidade(Integer agenteId, Integer habilidadeId, Integer nivel) {
        this.agenteId = agenteId;
        this.habilidadeId = habilidadeId;
        this.nivel = nivel;
    }

    public AgenteHabilidade() {
    }

    public Integer getAgenteId() {
        return agenteId;
    }

    public void setAgenteId(Integer agenteId) {
        this.agenteId = agenteId;
    }

    public Integer getHabilidadeId() {
        return habilidadeId;
    }

    public void setHabilidadeId(Integer habilidadeId) {
        this.habilidadeId = habilidadeId;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }
}
