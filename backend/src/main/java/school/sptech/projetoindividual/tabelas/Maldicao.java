package school.sptech.projetoindividual.tabelas;

public class Maldicao {

    /*id INT PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(100),
    elemento_id INT,
    descricao TEXT,
    custo_pe INT DEFAULT 0,
    quantidade_dano_extra INT DEFAULT 0,
    dado_dano_extra_id INT DEFAULT NULL,
    FOREIGN KEY (elemento_id) REFERENCES elementos(id),
    FOREIGN KEY (dado_dano_extra_id) REFERENCES tipo_dado(id)*/

    private Integer id;
    private String titulo;
    private Integer elementoId;
    private String descricao;
    private Integer custoPe;
    private Integer quantidadeDanoExtra;
    private Integer dadoDanoExtraId;

    public Maldicao(Integer id, String titulo, Integer elementoId, String descricao, Integer custoPe, Integer quantidadeDanoExtra, Integer dadoDanoExtraId) {
        this.id = id;
        this.titulo = titulo;
        this.elementoId = elementoId;
        this.descricao = descricao;
        this.custoPe = custoPe;
        this.quantidadeDanoExtra = quantidadeDanoExtra;
        this.dadoDanoExtraId = dadoDanoExtraId;
    }

    public Maldicao() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getElementoId() {
        return elementoId;
    }

    public void setElementoId(Integer elementoId) {
        this.elementoId = elementoId;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getCustoPe() {
        return custoPe;
    }

    public void setCustoPe(Integer custoPe) {
        this.custoPe = custoPe;
    }

    public Integer getQuantidadeDanoExtra() {
        return quantidadeDanoExtra;
    }

    public void setQuantidadeDanoExtra(Integer quantidadeDanoExtra) {
        this.quantidadeDanoExtra = quantidadeDanoExtra;
    }

    public Integer getDadoDanoExtraId() {
        return dadoDanoExtraId;
    }

    public void setDadoDanoExtraId(Integer dadoDanoExtraId) {
        this.dadoDanoExtraId = dadoDanoExtraId;
    }
}
