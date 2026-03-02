package school.sptech.projetoindividual.tabelas;

public class Patente {

    /*id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    pp_necessarios INT DEFAULT 0,
    limite_credito ENUM('Baixo', 'Médio', 'Alto', 'Ilimitado') NOT NULL,
    limite_categoria_i INT DEFAULT 0,
    limite_categoria_ii INT DEFAULT 0,
    limite_categoria_iii INT DEFAULT 0,
    limite_categoria_iv INT DEFAULT 0*/

    private Integer id;
    private String nome;
    private Integer ppNecessarios;
    private String limiteCredito;
    private Integer limiteCategoriaI;
    private Integer limiteCategoriaII;
    private Integer limiteCategoriaIII;
    private Integer limiteCategoriaIV;

    public Patente(Integer id, String nome, Integer ppNecessarios, String limiteCredito, Integer limiteCategoriaI, Integer limiteCategoriaII, Integer limiteCategoriaIII, Integer limiteCategoriaIV) {
        this.id = id;
        this.nome = nome;
        this.ppNecessarios = ppNecessarios;
        this.limiteCredito = limiteCredito;
        this.limiteCategoriaI = limiteCategoriaI;
        this.limiteCategoriaII = limiteCategoriaII;
        this.limiteCategoriaIII = limiteCategoriaIII;
        this.limiteCategoriaIV = limiteCategoriaIV;
    }

    public Patente() {}

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

    public Integer getPpNecessarios() {
        return ppNecessarios;
    }

    public void setPpNecessarios(Integer ppNecessarios) {
        this.ppNecessarios = ppNecessarios;
    }

    public String getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(String limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public Integer getLimiteCategoriaI() {
        return limiteCategoriaI;
    }

    public void setLimiteCategoriaI(Integer limiteCategoriaI) {
        this.limiteCategoriaI = limiteCategoriaI;
    }

    public Integer getLimiteCategoriaII() {
        return limiteCategoriaII;
    }

    public void setLimiteCategoriaII(Integer limiteCategoriaII) {
        this.limiteCategoriaII = limiteCategoriaII;
    }

    public Integer getLimiteCategoriaIII() {
        return limiteCategoriaIII;
    }

    public void setLimiteCategoriaIII(Integer limiteCategoriaIII) {
        this.limiteCategoriaIII = limiteCategoriaIII;
    }

    public Integer getLimiteCategoriaIV() {
        return limiteCategoriaIV;
    }

    public void setLimiteCategoriaIV(Integer limiteCategoriaIV) {
        this.limiteCategoriaIV = limiteCategoriaIV;
    }
}
