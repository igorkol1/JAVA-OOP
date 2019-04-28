package a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc;

public class Main1 {

    public static void main(String[] args) {
        Product butter = new Product("Masło", 5.35);
        Product bread = new Product("Chleb", 1.19);
        Product tomato = new Product("Pomidor", 1.15);
        Product cucumber = new Product("Ogórek", 2.00);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(butter, 2);
        shoppingCart.addProduct(bread, 1);
        shoppingCart.addProduct(bread, 1);
        shoppingCart.addProduct(tomato, 10);
        shoppingCart.updateProduct(tomato, 5);
        shoppingCart.addProduct(cucumber, 2);
        shoppingCart.removeProduct(cucumber);

        shoppingCart.printReceipt();
    }
}
