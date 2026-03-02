package school.sptech.projetoindividual.tabelas;

public class AgenteItem {

    /*agente_id INT,
    item_id INT,
    quantidade INT DEFAULT 1,
    equipado BOOLEAN DEFAULT FALSE,
    em_missao BOOLEAN DEFAULT TRUE,
    PRIMARY KEY (agente_id, item_id),
    FOREIGN KEY (agente_id) REFERENCES agente(id),
    FOREIGN KEY (item_id) REFERENCES item(id)*/

    private Integer agenteId;
    private Integer itemId;
    private Integer quantidade;
    private Boolean emMissao;

    public AgenteItem(Integer agenteId, Integer itemId, Integer quantidade, Boolean emMissao) {
        this.agenteId = agenteId;
        this.itemId = itemId;
        this.quantidade = quantidade;
        this.emMissao = emMissao;
    }

    public AgenteItem() {
    }

    public Integer getAgenteId() {
        return agenteId;
    }

    public void setAgenteId(Integer agenteId) {
        this.agenteId = agenteId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Boolean getEmMissao() {
        return emMissao;
    }

    public void setEmMissao(Boolean emMissao) {
        this.emMissao = emMissao;
    }
}
