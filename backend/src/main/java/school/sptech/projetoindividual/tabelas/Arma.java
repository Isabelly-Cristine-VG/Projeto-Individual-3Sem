package school.sptech.projetoindividual.tabelas;

public class Arma {

    /*  id INT PRIMARY KEY,
    proficiencias VARCHAR(100),
    tipo_arma VARCHAR(50),
    empunhadura VARCHAR(50),
    quantidade_dano INT DEFAULT 1,
    dado_dano_id INT,
    critico_valor INT,
    critico_multiplicador INT DEFAULT 2,
    tipo_dano VARCHAR(50),
    alcance VARCHAR(50),
    FOREIGN KEY (id) REFERENCES item(id) ON DELETE CASCADE,
    FOREIGN KEY (dado_dano_id) REFERENCES tipo_dado(id)*/

    private Integer id;
    private String proficiencias;
    private String tipoArma;
    private String empunhadura;
    private Integer quantidadeDano;
    private Integer dadoDanoId;
    private Integer criticoValor;
    private Integer criticoMultiplicador;
    private String tipoDano;
    private String alcance;

    public Arma(Integer id, String proficiencias, String tipoArma, String empunhadura, Integer quantidadeDano, Integer dadoDanoId, Integer criticoValor, Integer criticoMultiplicador, String tipoDano, String alcance) {
        this.id = id;
        this.proficiencias = proficiencias;
        this.tipoArma = tipoArma;
        this.empunhadura = empunhadura;
        this.quantidadeDano = quantidadeDano;
        this.dadoDanoId = dadoDanoId;
        this.criticoValor = criticoValor;
        this.criticoMultiplicador = criticoMultiplicador;
        this.tipoDano = tipoDano;
        this.alcance = alcance;
    }

    public Arma() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProficiencias() {
        return proficiencias;
    }

    public void setProficiencias(String proficiencias) {
        this.proficiencias = proficiencias;
    }

    public String getTipoArma() {
        return tipoArma;
    }

    public void setTipoArma(String tipoArma) {
        this.tipoArma = tipoArma;
    }

    public String getEmpunhadura() {
        return empunhadura;
    }

    public void setEmpunhadura(String empunhadura) {
        this.empunhadura = empunhadura;
    }

    public Integer getQuantidadeDano() {
        return quantidadeDano;
    }

    public void setQuantidadeDano(Integer quantidadeDano) {
        this.quantidadeDano = quantidadeDano;
    }

    public Integer getDadoDanoId() {
        return dadoDanoId;
    }

    public void setDadoDanoId(Integer dadoDanoId) {
        this.dadoDanoId = dadoDanoId;
    }

    public Integer getCriticoValor() {
        return criticoValor;
    }

    public void setCriticoValor(Integer criticoValor) {
        this.criticoValor = criticoValor;
    }

    public Integer getCriticoMultiplicador() {
        return criticoMultiplicador;
    }

    public void setCriticoMultiplicador(Integer criticoMultiplicador) {
        this.criticoMultiplicador = criticoMultiplicador;
    }

    public String getTipoDano() {
        return tipoDano;
    }

    public void setTipoDano(String tipoDano) {
        this.tipoDano = tipoDano;
    }

    public String getAlcance() {
        return alcance;
    }

    public void setAlcance(String alcance) {
        this.alcance = alcance;
    }
}
