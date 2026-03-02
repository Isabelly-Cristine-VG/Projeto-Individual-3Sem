package school.sptech.projetoindividual.tabelas;

public class Item {

    /*id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    tipo_id INT,
    peso DECIMAL(5,2) DEFAULT 0.00,
    espacos INT DEFAULT 1,
    categoria_prestigio ENUM('0', 'I', 'II', 'III', 'IV') DEFAULT '0',
    descricao TEXT,
    FOREIGN KEY (tipo_id) REFERENCES tipoItem(id)*/

    private Integer id;
    private String nome;
    private Integer tipoId;
    private Double peso;
    private Integer espacos;
    private String categoria;
    private String descricao;

    public Item(Integer id, String nome, Integer tipoId, Double peso, Integer espacos, String categoria, String descricao) {
        this.id = id;
        this.nome = nome;
        this.tipoId = tipoId;
        this.peso = peso;
        this.espacos = espacos;
        this.categoria = categoria;
        this.descricao = descricao;
    }

    public Item() {
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

    public Integer getTipoId() {
        return tipoId;
    }

    public void setTipoId(Integer tipoId) {
        this.tipoId = tipoId;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Integer getEspacos() {
        return espacos;
    }

    public void setEspacos(Integer espacos) {
        this.espacos = espacos;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
