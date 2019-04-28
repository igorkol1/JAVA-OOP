package a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc;

import java.util.Objects;
import java.util.UUID;

public class Product {

    private UUID id;
    private String name;
    private double price;

    public Product(String name, double price) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.price = price;
    }

    public void setPrice(double price) {
        if (price > 0.01) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Argument 'price' is lower than 0.01");
        }

    }

    public double getPrice() {
        return price;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return id.equals(product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
