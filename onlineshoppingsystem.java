public class OnlineShoppingSystem {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Laptop", 999.99);
        Product product2 = new Product(2, "Smartphone", 499.99);
        Product product3 = new Product(3, "Headphones", 199.99);

        Customer customer = new Customer(1, "Alice");

        ShoppingCart cart = new ShoppingCart(customer);
        cart.addProduct(product1, 1);
        cart.addProduct(product2, 2);

        System.out.println(cart);

        Order order = new Order(cart);
        System.out.println(order);
    }
}
