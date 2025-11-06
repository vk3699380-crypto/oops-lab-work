import java.time.LocalDate;
class ServiceOverdueException extends Exception { ServiceOverdueException(String msg) { super(msg); } }
class InvalidMileageException extends Exception { InvalidMileageException(String msg) { super(msg); } }
class VehicleMaintenanceTracker {
    void checkMaintenance(LocalDate serviceDate, int mileage) throws ServiceOverdueException, InvalidMileageException {
        if (serviceDate.isBefore(LocalDate.now())) throw new ServiceOverdueException("Service overdue!");
        if (mileage < 0) throw new InvalidMileageException("Invalid mileage input!");
        System.out.println("Vehicle maintenance OK.");
    }
    public static void main(String[] args) {
        VehicleMaintenanceTracker v = new VehicleMaintenanceTracker();
        try {
            v.checkMaintenance(LocalDate.of(2024, 1, 1), 12000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}