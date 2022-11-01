package solid.example;

public class Whisky extends TaxaItem {

    public Whisky(String descricao, Integer preco) {
        super("Whisky", descricao, preco);
    }

    @Override
    public Integer getTaxa() {
        return 20;
    }
}
