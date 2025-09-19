class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1000;

    CarRental() {
        customerName = "Unknown";
        carModel = "Standard";
        rentalDays = 1;
    }

    CarRental(String name, String model, int days) {
        customerName = name;
        carModel = model;
        rentalDays = days;
    }

    void display() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car: " + carModel);
        System.out.println("Days: " + rentalDays);
        System.out.println("Total Cost: " + rentalDays * costPerDay);
    }

    public static void main(String[] args) {
        CarRental c1 = new CarRental();
        CarRental c2 = new CarRental("Ankit", "BMW", 5);
        c1.display();
        c2.display();
    }
}
