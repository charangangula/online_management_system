class Customer:
    def __init__(self, customer_id, name):
        self.__id = customer_id      # private variable
        self.__name = name           # private variable

    def get_id(self):
        return self.__id

    def get_name(self):
        return self.__name

    def __str__(self):
        return f"Customer(id={self.__id}, name='{self.__name}')"
