package school.sptech.projetoindividual.tabelas;

public class CaracteristicaClasse {

    /*id INT PRIMARY KEY AUTO_INCREMENT,
    pontos_vida INT,
    pontos_esforco INT,
    sanidade INT,
    pericias_iniciais INT,
    proficiencias VARCHAR(200)*/

    private Integer id;
    private Integer pontosVida;
    private Integer pontosEsforco;
    private Integer sanidade;
    private Integer periciasIniciais;
    private String proficiencias;

    public CaracteristicaClasse(Integer id, Integer pontosVida, Integer pontosEsforco, Integer sanidade, Integer periciasIniciais, String proficiencias) {
        this.id = id;
        this.pontosVida = pontosVida;
        this.pontosEsforco = pontosEsforco;
        this.sanidade = sanidade;
        this.periciasIniciais = periciasIniciais;
        this.proficiencias = proficiencias;
    }

    public CaracteristicaClasse() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPontosVida() {
        return pontosVida;
    }

    public void setPontosVida(Integer pontosVida) {
        this.pontosVida = pontosVida;
    }

    public Integer getPontosEsforco() {
        return pontosEsforco;
    }

    public void setPontosEsforco(Integer pontosEsforco) {
        this.pontosEsforco = pontosEsforco;
    }

    public Integer getSanidade() {
        return sanidade;
    }

    public void setSanidade(Integer sanidade) {
        this.sanidade = sanidade;
    }

    public Integer getPericiasIniciais() {
        return periciasIniciais;
    }

    public void setPericiasIniciais(Integer periciasIniciais) {
        this.periciasIniciais = periciasIniciais;
    }

    public String getProficiencias() {
        return proficiencias;
    }

    public void setProficiencias(String proficiencias) {
        this.proficiencias = proficiencias;
    }
}
