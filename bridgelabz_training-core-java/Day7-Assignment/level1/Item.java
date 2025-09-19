class Item {
    int itemCode;
    String itemName;
    double price;
    void display(int qty) {
        double total = price * qty;
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + qty);
        System.out.println("Total Cost: " + total);
    }
    public static void main(String[] args) {
        Item i = new Item();
        i.itemCode = 111;
        i.itemName = "Pen";
        i.price = 10;
        i.display(5);
    }
}
