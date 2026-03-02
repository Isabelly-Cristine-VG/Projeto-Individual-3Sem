package school.sptech.projetoindividual.tabelas;

public class Habilidade {

    /*id INT PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(100),
    descricao TEXT,
    tipo ENUM('origem', 'obrigatoria', 'classe', 'trilha', 'especial'),
    referencia_id INT,
    nex_minimo INT DEFAULT 5,
    custo_pe INT DEFAULT 0*/

    private Integer id;
    private String titulo;
    private String descricao;
    private String tipo;
    private Integer referenciaId;
    private Integer nexMinimo;
    private Integer custoPe;

    public Habilidade(Integer id, String titulo, String descricao, String tipo, Integer referenciaId, Integer nexMinimo, Integer custoPe) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.tipo = tipo;
        this.referenciaId = referenciaId;
        this.nexMinimo = nexMinimo;
        this.custoPe = custoPe;
    }

    public Habilidade() {
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getReferenciaId() {
        return referenciaId;
    }

    public void setReferenciaId(Integer referenciaId) {
        this.referenciaId = referenciaId;
    }

    public Integer getNexMinimo() {
        return nexMinimo;
    }

    public void setNexMinimo(Integer nexMinimo) {
        this.nexMinimo = nexMinimo;
    }

    public Integer getCustoPe() {
        return custoPe;
    }

    public void setCustoPe(Integer custoPe) {
        this.custoPe = custoPe;
    }
}
