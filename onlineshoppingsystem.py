# Assuming Product, Customer, ShoppingCart, and Order classes are already defined

class OnlineShoppingSystem:
    @staticmethod
    def main():
        # Create products
        product1 = Product(1, "Laptop", 999.99)
        product2 = Product(2, "Smartphone", 499.99)
        product3 = Product(3, "Headphones", 199.99)

        # Create a customer
        customer = Customer(1, "Alice")

        # Create a shopping cart
        cart = ShoppingCart(customer)
        cart.add_product(product1, 1)
        cart.add_product(product2, 2)

        # Display cart details
        print(cart)

        # Create an order
        order = Order(cart)
        print(order)


# Run the main method
if __name__ == "__main__":
    OnlineShoppingSystem.main()
