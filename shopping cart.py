class ShoppingCart:
    def __init__(self, customer):
        self.__customer = customer
        self.__items = {}  # Dictionary: Product → Quantity

    def add_product(self, product, quantity):
        if product in self.__items:
            self.__items[product] += quantity
        else:
            self.__items[product] = quantity

    def remove_product(self, product):
        if product in self.__items:
            del self.__items[product]

    def get_total(self):
        total = 0.0
        for product, quantity in self.__items.items():
            total += product.get_price() * quantity
        return total

    def __str__(self):
        cart_str = f"ShoppingCart for {self.__customer.get_name()}\n"
        for product, quantity in self.__items.items():
            cart_str += f"{product.get_name()} - {quantity}\n"
        cart_str += f"Total: ${self.get_total():.2f}"
        return cart_str
