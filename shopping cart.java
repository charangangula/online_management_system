import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Customer customer;
    private Map<Product, Integer> items;

    public ShoppingCart(Customer customer) {
        this.customer = customer;
        this.items = new HashMap<>();
    }

    public void addProduct(Product product, int quantity) {
        items.put(product, items.getOrDefault(product, 0) + quantity);
    }

    public void removeProduct(Product product) {
        items.remove(product);
    }

    public double getTotal() {
        double total = 0.0;
        for (Map.Entry<Product, Integer> entry : items.entrySet()) {
            total += entry.getKey().getPrice() * entry.getValue();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ShoppingCart for ").append(customer.getName()).append("\n");
        for (Map.Entry<Product, Integer> entry : items.entrySet()) {
            sb.append(entry.getKey().getName()).append(" - ").append(entry.getValue()).append("\n");
        }
        sb.append("Total: $").append(getTotal());
        return sb.toString();
    }
}
