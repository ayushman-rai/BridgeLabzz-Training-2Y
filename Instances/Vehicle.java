public class Vehicle {
    private static double registrationFee = 1500.0; // shared among all
    private final String registrationNumber; // cannot change
    private String ownerName;
    private String vehicleType;

    // Constructor using 'this'
    Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Static method
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Display method
    void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Registration No: " + registrationNumber + ", Owner: " + ownerName +
                    ", Type: " + vehicleType + ", Fee: ₹" + registrationFee);
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("MH12AB1234", "Rohan", "Car");
        v1.displayVehicleDetails();
        Vehicle.updateRegistrationFee(2000.0);
        v1.displayVehicleDetails();
    }
}
