class CartItem {
    String itemName;
    double price;
    int quantity;
    void addItem(String n, double p, int q) {
        itemName = n;
        price = p;
        quantity = q;
    }
    void removeItem() {
        itemName = "";
        price = 0;
        quantity = 0;
    }
    void displayTotalCost() {
        double total = price * quantity;
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + total);
    }
    public static void main(String[] args) {
        CartItem c = new CartItem();
        c.addItem("Shirt", 750, 2);
        c.displayTotalCost();
        c.removeItem();
        c.displayTotalCost();
    }
}
