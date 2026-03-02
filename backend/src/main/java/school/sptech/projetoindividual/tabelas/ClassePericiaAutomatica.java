package school.sptech.projetoindividual.tabelas;

public class ClassePericiaAutomatica {

    /*classe_id INT,
    pericia_id INT,
    PRIMARY KEY (classe_id, pericia_id),
    FOREIGN KEY (classe_id) REFERENCES classe(id),
    FOREIGN KEY (pericia_id) REFERENCES pericias(id)*/

    private Integer id;
    private Integer periciaId;

    public ClassePericiaAutomatica(Integer id, Integer periciaId) {
        this.id = id;
        this.periciaId = periciaId;
    }

    public ClassePericiaAutomatica() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPericiaId() {
        return periciaId;
    }

    public void setPericiaId(Integer periciaId) {
        this.periciaId = periciaId;
    }
}
