package school.sptech.projetoindividual.tabelas;

public class ArmaMaldicao {

    /*arma_id INT,
    maldicao_id INT,
    PRIMARY KEY (arma_id, maldicao_id),
    FOREIGN KEY (arma_id) REFERENCES arma(id),
    FOREIGN KEY (maldicao_id) REFERENCES maldicao(id)*/

    private Integer armaId;
    private Integer MaldicaoId;

    public ArmaMaldicao(Integer armaId, Integer maldicaoId) {
        this.armaId = armaId;
        MaldicaoId = maldicaoId;
    }

    public ArmaMaldicao() {
    }

    public Integer getArmaId() {
        return armaId;
    }

    public void setArmaId(Integer armaId) {
        this.armaId = armaId;
    }

    public Integer getMaldicaoId() {
        return MaldicaoId;
    }

    public void setMaldicaoId(Integer maldicaoId) {
        MaldicaoId = maldicaoId;
    }
}
