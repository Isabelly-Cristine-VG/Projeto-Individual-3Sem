package school.sptech.projetoindividual.tabelas;

public class AgenteRitual {

    /*agente_id INT,
    ritual_id INT,
    nivel_aprendido ENUM('indouta', 'discente', 'verdadeiro') DEFAULT 'indouta',
    PRIMARY KEY (agente_id, ritual_id),
    FOREIGN KEY (agente_id) REFERENCES agente(id),
    FOREIGN KEY (ritual_id) REFERENCES ritual(id)*/

    private Integer agenteId;
    private Integer ritualId;
    private String nivelAprendido;

    public AgenteRitual(Integer agenteId, Integer ritualId, String nivelAprendido) {
        this.agenteId = agenteId;
        this.ritualId = ritualId;
        this.nivelAprendido = nivelAprendido;
    }

    public AgenteRitual() {
    }

    public Integer getAgenteId() {
        return agenteId;
    }

    public void setAgenteId(Integer agenteId) {
        this.agenteId = agenteId;
    }

    public Integer getRitualId() {
        return ritualId;
    }

    public void setRitualId(Integer ritualId) {
        this.ritualId = ritualId;
    }

    public String getNivelAprendido() {
        return nivelAprendido;
    }

    public void setNivelAprendido(String nivelAprendido) {
        this.nivelAprendido = nivelAprendido;
    }
}
