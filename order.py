class Order:
    # Class variable (equivalent to static variable in Java)
    order_counter = 1

    def __init__(self, cart):
        self.__order_id = Order.order_counter
        self.__cart = cart
        Order.order_counter += 1  # increment for next order

    def get_order_id(self):
        return self.__order_id

    def get_cart(self):
        return self.__cart

    def __str__(self):
        return f"Order(order_id={self.__order_id}, cart={self.__cart})"
