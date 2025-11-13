class Product:
    def __init__(self, product_id, name, price):
        self.__id = product_id      # private variable
        self.__name = name
        self.__price = price

    def get_id(self):
        return self.__id

    def get_name(self):
        return self.__name

    def get_price(self):
        return self.__price

    def __str__(self):
        return f"Product(id={self.__id}, name='{self.__name}', price={self.__price})"
