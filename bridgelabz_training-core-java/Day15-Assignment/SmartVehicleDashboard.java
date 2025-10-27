interface Vehicle {
    void displaySpeed();

    default void displayBattery() {
        System.out.println("Battery status not available for this vehicle.");
    }
}

class Car implements Vehicle {
    public void displaySpeed() {
        System.out.println("Car speed: 80 km/h");
    }
}

class ElectricCar implements Vehicle {
    public void displaySpeed() {
        System.out.println("Electric car speed: 70 km/h");
    }

    public void displayBattery() {
        System.out.println("Battery level: 85%");
    }
}

public class SmartVehicleDashboard {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle eCar = new ElectricCar();

        car.displaySpeed();
        car.displayBattery();

        eCar.displaySpeed();
        eCar.displayBattery();
    }
}
