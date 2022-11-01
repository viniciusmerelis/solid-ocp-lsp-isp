package solid.example;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.addItem(new Cerveja("Coruja 600ml", 20)); //10% imposto
        pedido.addItem(new Whisky("Jack Daniels", 100)); //20% imposto
        pedido.addItem(new Agua("Crystal 500ml", 5)); //0% imposto
        int taxas = 0;
        taxas = pedido.getTaxas();
        if (taxas == 22) {
            System.out.println("Success!");
        } else {
            System.out.println("Failed!");
        }
    }
}
