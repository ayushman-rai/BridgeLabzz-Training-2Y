public class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 1500.0; 

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Vehicle Type: " + vehicleType +
                ", Registration Fee: " + registrationFee);
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Rohan", "Car");
        Vehicle v2 = new Vehicle("Meera", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(2000.0);
        System.out.println("\nAfter updating registration fee:\n");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
