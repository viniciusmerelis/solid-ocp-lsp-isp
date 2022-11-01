package solid.example;

public class Cerveja extends TaxaItem {

    public Cerveja(String descricao, Integer preco) {
        super("Cerveja", descricao, preco);
    }

    @Override
    public Integer getTaxa() {
        return 10;
    }
}
