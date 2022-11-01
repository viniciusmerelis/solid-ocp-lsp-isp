package solid.example;

public abstract class Item {
    private String categoria;
    private String descricao;
    private Integer preco;

    public Item(String categoria, String descricao, Integer preco) {
        this.categoria = categoria;
        this.descricao = descricao;
        this.preco = preco;
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

    public Integer getPreco() {
        return preco;
    }

    public void setPreco(Integer preco) {
        this.preco = preco;
    }
}
