package refactor.ref1;
/*
Tarea: Refactorizar el método processOrder para utilizar un objeto
de parámetro que contenga itemName, quantity, price, y customerName.
 */

class Order {

    private String itemName;
    private int quantity;
    private double price;
    private String customerName;

    public Order(String itemName, int quantity, double price, String customerName) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.customerName = customerName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    void processOrder(Order order1) {
        // Procesamiento del pedido
        order1.getItemName();
        order1.getPrice();
        order1.getQuantity();
        order1.getCustomerName();
    }
}