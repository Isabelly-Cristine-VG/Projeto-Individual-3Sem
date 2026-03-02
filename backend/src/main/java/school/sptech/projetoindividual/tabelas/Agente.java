package school.sptech.projetoindividual.tabelas;

public class Agente {

    /*id INT PRIMARY KEY AUTO_INCREMENT,
    usuario_id INT NOT NULL,
    nome VARCHAR(100) NOT NULL,
    jogador VARCHAR(100),
    nex INT DEFAULT 5 CHECK (nex BETWEEN 0 AND 100),
    pv_atual INT,
    pv_max INT,
    pe_atual INT,
    pe_max INT,
    sanidade_atual INT,
    sanidade_max INT,
    classe_id INT,
    trilha_id INT DEFAULT NULL,
    origem_id INT,
    elemento_id INT DEFAULT NULL,
    medo VARCHAR(100),
    defesa_passiva INT DEFAULT 10,
    bonus_esquiva INT DEFAULT 0,
    bonus_bloqueio INT DEFAULT 0,
    resistencia_balistica INT DEFAULT 0,
    resistencia_fisica INT DEFAULT 0,
    pontos_prestigio INT DEFAULT 0,
    patente_id INT DEFAULT 1,
    carga_max INT,
    carga_atual DECIMAL(5,2) DEFAULT 0.00,
    idade INT,
    altura VARCHAR(20),
    peso DECIMAL(5,1),
    aparencia TEXT,
    personalidade TEXT,
    historia TEXT,
    FOREIGN KEY (usuario_id) REFERENCES usuario(id) ON DELETE CASCADE,
    FOREIGN KEY (classe_id) REFERENCES classe(id),
    FOREIGN KEY (trilha_id) REFERENCES trilha(id),
    FOREIGN KEY (origem_id) REFERENCES origem(id),
    FOREIGN KEY (elemento_id) REFERENCES elementos(id),
    FOREIGN KEY (patente_id) REFERENCES patente(id)*/

    private Integer id;
    private Integer usuarioId;
    private String nome;
    private String jogador;
    private Integer nex;
    private Integer pvAtual;
    private Integer pvMax;
    private Integer peAtual;
    private Integer peMax;
    private Integer sanidadeAtual;
    private Integer sanidadeMax;
    private Integer classeId;
    private Integer trilhaId;
    private Integer origemId;
    private Integer elementoId;
    private String medo;
    private Integer defesaPassiva;
    private Integer bonusEsquiva;
    private Integer bonusBloqueio;
    private Integer resistenciaBalistica;
    private Integer resistenciaFisica;
    private Integer pontosPrestigio;
    private Integer patenteId;
    private Integer cargaMax;
    private Double cargaAtual;
    private Integer idade;
    private String altura;
    private Double peso;
    private String aparencia;
    private String personalidade;
    private String historia;

    public Agente(Integer id, Integer usuarioId, String nome, String jogador, Integer nex, Integer pvAtual, Integer pvMax, Integer peAtual, Integer peMax, Integer sanidadeAtual, Integer sanidadeMax, Integer classeId, Integer trilhaId, Integer origemId, Integer elementoId, String medo, Integer defesaPassiva, Integer bonusEsquiva, Integer bonusBloqueio, Integer resistenciaBalistica, Integer resistenciaFisica, Integer pontosPrestigio, Integer patenteId, Integer cargaMax, Double cargaAtual, Integer idade, String altura, Double peso, String aparencia, String personalidade, String historia) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.nome = nome;
        this.jogador = jogador;
        this.nex = nex;
        this.pvAtual = pvAtual;
        this.pvMax = pvMax;
        this.peAtual = peAtual;
        this.peMax = peMax;
        this.sanidadeAtual = sanidadeAtual;
        this.sanidadeMax = sanidadeMax;
        this.classeId = classeId;
        this.trilhaId = trilhaId;
        this.origemId = origemId;
        this.elementoId = elementoId;
        this.medo = medo;
        this.defesaPassiva = defesaPassiva;
        this.bonusEsquiva = bonusEsquiva;
        this.bonusBloqueio = bonusBloqueio;
        this.resistenciaBalistica = resistenciaBalistica;
        this.resistenciaFisica = resistenciaFisica;
        this.pontosPrestigio = pontosPrestigio;
        this.patenteId = patenteId;
        this.cargaMax = cargaMax;
        this.cargaAtual = cargaAtual;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.aparencia = aparencia;
        this.personalidade = personalidade;
        this.historia = historia;
    }

    public Agente() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getJogador() {
        return jogador;
    }

    public void setJogador(String jogador) {
        this.jogador = jogador;
    }

    public Integer getNex() {
        return nex;
    }

    public void setNex(Integer nex) {
        this.nex = nex;
    }

    public Integer getPvAtual() {
        return pvAtual;
    }

    public void setPvAtual(Integer pvAtual) {
        this.pvAtual = pvAtual;
    }

    public Integer getPvMax() {
        return pvMax;
    }

    public void setPvMax(Integer pvMax) {
        this.pvMax = pvMax;
    }

    public Integer getPeAtual() {
        return peAtual;
    }

    public void setPeAtual(Integer peAtual) {
        this.peAtual = peAtual;
    }

    public Integer getPeMax() {
        return peMax;
    }

    public void setPeMax(Integer peMax) {
        this.peMax = peMax;
    }

    public Integer getSanidadeAtual() {
        return sanidadeAtual;
    }

    public void setSanidadeAtual(Integer sanidadeAtual) {
        this.sanidadeAtual = sanidadeAtual;
    }

    public Integer getSanidadeMax() {
        return sanidadeMax;
    }

    public void setSanidadeMax(Integer sanidadeMax) {
        this.sanidadeMax = sanidadeMax;
    }

    public Integer getClasseId() {
        return classeId;
    }

    public void setClasseId(Integer classeId) {
        this.classeId = classeId;
    }

    public Integer getTrilhaId() {
        return trilhaId;
    }

    public void setTrilhaId(Integer trilhaId) {
        this.trilhaId = trilhaId;
    }

    public Integer getOrigemId() {
        return origemId;
    }

    public void setOrigemId(Integer origemId) {
        this.origemId = origemId;
    }

    public Integer getElementoId() {
        return elementoId;
    }

    public void setElementoId(Integer elementoId) {
        this.elementoId = elementoId;
    }

    public String getMedo() {
        return medo;
    }

    public void setMedo(String medo) {
        this.medo = medo;
    }

    public Integer getDefesaPassiva() {
        return defesaPassiva;
    }

    public void setDefesaPassiva(Integer defesaPassiva) {
        this.defesaPassiva = defesaPassiva;
    }

    public Integer getBonusEsquiva() {
        return bonusEsquiva;
    }

    public void setBonusEsquiva(Integer bonusEsquiva) {
        this.bonusEsquiva = bonusEsquiva;
    }

    public Integer getBonusBloqueio() {
        return bonusBloqueio;
    }

    public void setBonusBloqueio(Integer bonusBloqueio) {
        this.bonusBloqueio = bonusBloqueio;
    }

    public Integer getResistenciaBalistica() {
        return resistenciaBalistica;
    }

    public void setResistenciaBalistica(Integer resistenciaBalistica) {
        this.resistenciaBalistica = resistenciaBalistica;
    }

    public Integer getResistenciaFisica() {
        return resistenciaFisica;
    }

    public void setResistenciaFisica(Integer resistenciaFisica) {
        this.resistenciaFisica = resistenciaFisica;
    }

    public Integer getPontosPrestigio() {
        return pontosPrestigio;
    }

    public void setPontosPrestigio(Integer pontosPrestigio) {
        this.pontosPrestigio = pontosPrestigio;
    }

    public Integer getPatenteId() {
        return patenteId;
    }

    public void setPatenteId(Integer patenteId) {
        this.patenteId = patenteId;
    }

    public Integer getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(Integer cargaMax) {
        this.cargaMax = cargaMax;
    }

    public Double getCargaAtual() {
        return cargaAtual;
    }

    public void setCargaAtual(Double cargaAtual) {
        this.cargaAtual = cargaAtual;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getAparencia() {
        return aparencia;
    }

    public void setAparencia(String aparencia) {
        this.aparencia = aparencia;
    }

    public String getPersonalidade() {
        return personalidade;
    }

    public void setPersonalidade(String personalidade) {
        this.personalidade = personalidade;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }
}
