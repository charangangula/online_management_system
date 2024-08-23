public class Order {
    private static int orderCounter = 1;
    private int orderId;
    private ShoppingCart cart;

    public Order(ShoppingCart cart) {
        this.orderId = orderCounter++;
        this.cart = cart;
    }

    public int getOrderId() {
        return orderId;
    }

    public ShoppingCart getCart() {
        return cart;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", cart=" + cart +
                '}';
    }
}
