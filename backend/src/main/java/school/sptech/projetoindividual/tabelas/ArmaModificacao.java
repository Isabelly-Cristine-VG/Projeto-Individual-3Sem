package school.sptech.projetoindividual.tabelas;

public class ArmaModificacao {

    /*arma_id INT,
    modificacao_id INT,
    PRIMARY KEY (arma_id, modificacao_id),
    FOREIGN KEY (arma_id) REFERENCES arma(id),
    FOREIGN KEY (modificacao_id) REFERENCES modificacao(id)*/

    private Integer armaId;
    private Integer modificacaoId;

    public ArmaModificacao(Integer armaId, Integer modificacaoId) {
        this.armaId = armaId;
        this.modificacaoId = modificacaoId;
    }

    public ArmaModificacao() {
    }

    public Integer getArmaId() {
        return armaId;
    }

    public void setArmaId(Integer armaId) {
        this.armaId = armaId;
    }

    public Integer getModificacaoId() {
        return modificacaoId;
    }

    public void setModificacaoId(Integer modificacaoId) {
        this.modificacaoId = modificacaoId;
    }
}
