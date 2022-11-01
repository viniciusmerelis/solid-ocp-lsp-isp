package solid.example;

public abstract class TaxaItem extends Item {
    public TaxaItem(String categoria, String descricao, Integer preco) {
        super(categoria, descricao, preco);
    }

    public Integer calculadorTaxa() {
        return (getPreco() * getTaxa()) / 100;
    }

    public abstract Integer getTaxa();
}
