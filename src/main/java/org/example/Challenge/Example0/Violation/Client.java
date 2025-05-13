package org.example.Challenge.Example0.Violation;

/**
 * This is a simple exercise. Use SOLID principle to refactor the code.
 */
public class Client {
    public class Main {
        public static void main(String[] args) {
            Order order = new Order();
            order.processOrder("Laptop, Quantity: 1");
        }
    }
}
class Database {
    public void saveOrder(String orderDetails) {
        System.out.println("Saving to real database: " + orderDetails);
    }
}

class Order {
    private Database db = new Database();
    public void processOrder(String orderDetails) {
        System.out.println("Processing order: " + orderDetails);
        db.saveOrder(orderDetails);
    }
}

