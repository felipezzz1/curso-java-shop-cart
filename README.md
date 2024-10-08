# Shopping Cart Challenge

This project simulates a shopping cart system where users can make purchases using a credit card, with a limit set at the beginning. The project allows the user to make multiple purchases and displays a shopping summary at the end.

## Project Structure

The project is organized into the following structure:

- `main`: Contains the `Main` class, which serves as the entry point for running the program.
- `models`: Contains the classes that model the behavior of the credit card and shopping items.

## Classes Overview

### `CreditCard`
Represents a credit card that the user will use to make purchases.

- **Attributes:**
    - `limit`: The credit card limit set at the beginning.
    - `balance`: The current available balance.
    - `shopping`: A list of purchases made with the card.

- **Methods:**
    - `CreditCard(double limit)`: Constructor that sets the card limit and initializes the balance and shopping list.
    - `boolean buy(Shopping buy)`: Attempts to make a purchase. If the card has sufficient balance, the purchase is added to the list, and the balance is reduced.
    - `double getLimit()`: Returns the card limit.
    - `double getBalance()`: Returns the remaining balance on the card.
    - `List<Shopping> getShopping()`: Returns the list of all purchases.

### `Shopping`
Represents an individual shopping item.

- **Attributes:**
    - `description`: A string describing the item.
    - `price`: The price of the item.

- **Methods:**
    - `Shopping(String description, double price)`: Constructor that initializes the shopping item with a description and price.
    - `String getDescription()`: Returns the description of the shopping item.
    - `double getPrice()`: Returns the price of the shopping item.
    - `int compareTo(Shopping otherShopping)`: Allows sorting of items based on price.

### `Main`
This is the main class of the program, where users can interact with the system.

- **How it works:**
    - The user is prompted to input the credit card limit.
    - The user can then add purchases by providing a description and price for each shopping item.
    - The system checks if the credit card balance is sufficient for each purchase.
    - The user can choose to stop shopping at any time.
    - After shopping, the program displays a sorted list of purchases (by price) and the remaining card balance.

## How to Run

1. Ensure you have a Java development environment set up.
2. Compile the `Main.java` file located in the `main` package.
3. Run the `Main` class, which will prompt you to input:
    - The credit card limit.
    - Descriptions and prices for items you want to buy.

4. Once you finish shopping, the program will print a summary of your purchases and the remaining credit card balance.

