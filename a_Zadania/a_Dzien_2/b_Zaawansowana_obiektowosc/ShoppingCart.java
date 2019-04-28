package a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<CartItem> cartItems = new ArrayList<>();

    public void addProduct(Product product, int quantity) {
        CartItem cartItem = getCartItemWithProduct(product);
        if (cartItem != null) {
            cartItem.increaseQuantity(quantity);
        } else {
            cartItems.add(new CartItem(product, quantity));
        }
    }

    public void removeProduct(Product product) {
        CartItem cartItem = getCartItemWithProduct(product);
        if (cartItem != null) {
            cartItems.remove(cartItem);
        }
    }

    public void updateProduct(Product product, int quantity) {
        CartItem cartItem = getCartItemWithProduct(product);
        if (cartItem != null) {
            cartItem.setQuantity(quantity);
        }
    }

    public int getTotalQuantity() {
        int quantitySum = 0;
        CartItem[] cartItemsArray = cartItems.toArray(new CartItem[]{});
        for (CartItem item : cartItemsArray) {
            quantitySum += item.getQuantity();
        }
        return quantitySum;
    }

    public double getTotalSum() {
        double totalPrice = 0;
        CartItem[] cartItemsArray = cartItems.toArray(new CartItem[]{});
        for (CartItem item : cartItemsArray) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public void printReceipt() {
        CartItem[] cartItemsArray = cartItems.toArray(new CartItem[]{});
        for (int i = 0; i < cartItemsArray.length; i++) {
            System.out.println((i + 1) + ". " + cartItemsArray[i].toString());
        }
        System.out.println("--");
        System.out.println("Razem: " + getTotalSum());
    }

    private CartItem getCartItemWithProduct(Product product) {
        CartItem[] cartItemsArray = cartItems.toArray(new CartItem[]{});
        for (CartItem item : cartItemsArray) {
            if (product.equals(item.getProduct())) {
                return item;
            }
        }
        return null;
    }

}
