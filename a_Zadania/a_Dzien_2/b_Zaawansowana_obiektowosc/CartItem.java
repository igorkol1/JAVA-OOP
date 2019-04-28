package a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc;

public class CartItem {

    private Product product;
    private int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void increaseQuantity(int addValue) {
        quantity += addValue;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return quantity * product.getPrice();
    }

    @Override
    public String toString() {
        return product.getName() + ", " + quantity + "x" + product.getPrice() + " = " + getPrice();
    }
}
