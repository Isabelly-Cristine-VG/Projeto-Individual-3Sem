package school.sptech.projetoindividual.tabelas;

public class Ritual {

    /*id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    elemento_id INT,
    circulo INT CHECK (circulo BETWEEN 1 AND 4),
    custo_pe_base INT,
    execucao VARCHAR(50),
    alcance VARCHAR(50),
    area VARCHAR(100),
    alvo VARCHAR(50),
    duracao VARCHAR(50),
    efeito TEXT,
    resistencia VARCHAR(100),
    quantidade_dados_base INT DEFAULT 0,
    dado_base_id INT DEFAULT NULL,
    quantidade_dados_discente INT DEFAULT 0,
    dado_discente_id INT DEFAULT NULL,
    quantidade_dados_verdadeiro INT DEFAULT 0,
    dado_verdadeiro_id INT DEFAULT NULL,
    componentes VARCHAR(200),
    nex_minimo INT DEFAULT 5,
    aprimoramentos TEXT,
    descricao TEXT,
    FOREIGN KEY (elemento_id) REFERENCES elementos(id),
    FOREIGN KEY (dado_base_id) REFERENCES tipo_dado(id),
    FOREIGN KEY (dado_discente_id) REFERENCES tipo_dado(id),
    FOREIGN KEY (dado_verdadeiro_id) REFERENCES tipo_dado(id)*/

    private Integer id;
    private String nome;
    private Integer elementoId;
    private Integer circulo;
    private Integer custoPeBase;
    private String execucao;
    private String alcance;
    private String area;
    private String alvo;
    private String duracao;
    private String efeito;
    private String resistencia;
    private Integer quantidadeDadosBase;
    private Integer dadoBaseId;
    private Integer quantidadeDadosDiscente;
    private Integer dadoDiscenteId;
    private Integer quantidadeDadosVerdadeiro;
    private Integer dadoVerdadeiroId;
    private String componentes;
    private Integer nexMinimo;
    private String aprimoramento;
    private String descricao;

    public Ritual(Integer id, String nome, Integer elementoId, Integer circulo, Integer custoPeBase, String execucao, String alcance, String area, String alvo, String duracao, String efeito, String resistencia, Integer quantidadeDadosBase, Integer dadoBaseId, Integer quantidadeDadosDiscente, Integer dadoDiscenteId, Integer quantidadeDadosVerdadeiro, Integer dadoVerdadeiroId, String componentes, Integer nexMinimo, String aprimoramento, String descricao) {
        this.id = id;
        this.nome = nome;
        this.elementoId = elementoId;
        this.circulo = circulo;
        this.custoPeBase = custoPeBase;
        this.execucao = execucao;
        this.alcance = alcance;
        this.area = area;
        this.alvo = alvo;
        this.duracao = duracao;
        this.efeito = efeito;
        this.resistencia = resistencia;
        this.quantidadeDadosBase = quantidadeDadosBase;
        this.dadoBaseId = dadoBaseId;
        this.quantidadeDadosDiscente = quantidadeDadosDiscente;
        this.dadoDiscenteId = dadoDiscenteId;
        this.quantidadeDadosVerdadeiro = quantidadeDadosVerdadeiro;
        this.dadoVerdadeiroId = dadoVerdadeiroId;
        this.componentes = componentes;
        this.nexMinimo = nexMinimo;
        this.aprimoramento = aprimoramento;
        this.descricao = descricao;
    }

    public Ritual() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getElementoId() {
        return elementoId;
    }

    public void setElementoId(Integer elementoId) {
        this.elementoId = elementoId;
    }

    public Integer getCirculo() {
        return circulo;
    }

    public void setCirculo(Integer circulo) {
        this.circulo = circulo;
    }

    public Integer getCustoPeBase() {
        return custoPeBase;
    }

    public void setCustoPeBase(Integer custoPeBase) {
        this.custoPeBase = custoPeBase;
    }

    public String getExecucao() {
        return execucao;
    }

    public void setExecucao(String execucao) {
        this.execucao = execucao;
    }

    public String getAlcance() {
        return alcance;
    }

    public void setAlcance(String alcance) {
        this.alcance = alcance;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAlvo() {
        return alvo;
    }

    public void setAlvo(String alvo) {
        this.alvo = alvo;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getEfeito() {
        return efeito;
    }

    public void setEfeito(String efeito) {
        this.efeito = efeito;
    }

    public String getResistencia() {
        return resistencia;
    }

    public void setResistencia(String resistencia) {
        this.resistencia = resistencia;
    }

    public Integer getQuantidadeDadosBase() {
        return quantidadeDadosBase;
    }

    public void setQuantidadeDadosBase(Integer quantidadeDadosBase) {
        this.quantidadeDadosBase = quantidadeDadosBase;
    }

    public Integer getDadoBaseId() {
        return dadoBaseId;
    }

    public void setDadoBaseId(Integer dadoBaseId) {
        this.dadoBaseId = dadoBaseId;
    }

    public Integer getQuantidadeDadosDiscente() {
        return quantidadeDadosDiscente;
    }

    public void setQuantidadeDadosDiscente(Integer quantidadeDadosDiscente) {
        this.quantidadeDadosDiscente = quantidadeDadosDiscente;
    }

    public Integer getDadoDiscenteId() {
        return dadoDiscenteId;
    }

    public void setDadoDiscenteId(Integer dadoDiscenteId) {
        this.dadoDiscenteId = dadoDiscenteId;
    }

    public Integer getQuantidadeDadosVerdadeiro() {
        return quantidadeDadosVerdadeiro;
    }

    public void setQuantidadeDadosVerdadeiro(Integer quantidadeDadosVerdadeiro) {
        this.quantidadeDadosVerdadeiro = quantidadeDadosVerdadeiro;
    }

    public Integer getDadoVerdadeiroId() {
        return dadoVerdadeiroId;
    }

    public void setDadoVerdadeiroId(Integer dadoVerdadeiroId) {
        this.dadoVerdadeiroId = dadoVerdadeiroId;
    }

    public String getComponentes() {
        return componentes;
    }

    public void setComponentes(String componentes) {
        this.componentes = componentes;
    }

    public Integer getNexMinimo() {
        return nexMinimo;
    }

    public void setNexMinimo(Integer nexMinimo) {
        this.nexMinimo = nexMinimo;
    }

    public String getAprimoramento() {
        return aprimoramento;
    }

    public void setAprimoramento(String aprimoramento) {
        this.aprimoramento = aprimoramento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
