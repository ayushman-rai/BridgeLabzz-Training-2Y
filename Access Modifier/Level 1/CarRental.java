public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1500.0;

    CarRental() {
        customerName = "Unknown";
        carModel = "Basic";
        rentalDays = 1;
    }

    CarRental(String name, String model, int days) {
        customerName = name;
        carModel = model;
        rentalDays = days;
    }

    double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    void display() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel + ", Days: " + rentalDays + ", Total Cost: ₹" + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental r1 = new CarRental();
        CarRental r2 = new CarRental("Amit", "Honda City", 4);

        r1.display();
        r2.display();
    }
}
