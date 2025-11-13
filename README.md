Online Shopping System (Python OOP Version)
🧠 Overview

An Online Shopping System in Python using Object-Oriented Programming (OOP) simulates a real-world e-commerce platform with products, customers, carts, and orders.

OOP helps keep the code modular, reusable, and easier to maintain.

⚙️ Key OOP Concepts Applied
1. Encapsulation

Encapsulation means keeping data and the methods that operate on that data together, while restricting direct access.

In this system:

Product, Customer, ShoppingCart, and Order classes encapsulate their data.

Private variables are prefixed with __, e.g., self.__price.

Getter methods are used to access these private values.

2. Inheritance

Inheritance allows one class to reuse and extend another class’s behavior.

In this system:

You could create subclasses like Electronics(Product) or Clothing(Product) in the future.

3. Polymorphism

Polymorphism allows the same method to behave differently based on the object.

In this system:

If you had subclasses of Product or Order, you could override methods like __str__() or get_total() to customize behavior.

4. Abstraction

Abstraction hides unnecessary complexity and shows only essential details.

In this system:

The ShoppingCart class abstracts how totals are calculated or items are stored.

The user only interacts with simple methods like add_product() and get_total().
