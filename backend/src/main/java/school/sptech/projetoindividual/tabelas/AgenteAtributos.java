package school.sptech.projetoindividual.tabelas;

public class AgenteAtributos {

    /*agente_id INT,
    atributo_id INT,
    valor_base INT,
    valor_total INT,
    PRIMARY KEY (agente_id, atributo_id),
    FOREIGN KEY (agente_id) REFERENCES agente(id),
    FOREIGN KEY (atributo_id) REFERENCES atributos(id)*/

    private Integer id;
    private Integer atributoId;
    private Integer valorBase;
    private Integer valorTotal;

    public AgenteAtributos(Integer id, Integer atributoId, Integer valorBase, Integer valorTotal) {
        this.id = id;
        this.atributoId = atributoId;
        this.valorBase = valorBase;
        this.valorTotal = valorTotal;
    }

    public AgenteAtributos() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAtributoId() {
        return atributoId;
    }

    public void setAtributoId(Integer atributoId) {
        this.atributoId = atributoId;
    }

    public Integer getValorBase() {
        return valorBase;
    }

    public void setValorBase(Integer valorBase) {
        this.valorBase = valorBase;
    }

    public Integer getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Integer valorTotal) {
        this.valorTotal = valorTotal;
    }
}
