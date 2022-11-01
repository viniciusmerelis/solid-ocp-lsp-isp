package solid.example;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    public Pedido() { }

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public Integer getTaxas() {
        int taxa = 0;
        for(Item item : items) {
            if(item instanceof TaxaItem) {
                taxa += ((TaxaItem) item).calculadorTaxa();
            }
        }
        return taxa;
    }

}
