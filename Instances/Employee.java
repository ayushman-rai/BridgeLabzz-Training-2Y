public class Employee {
    private static String companyName = "Tech Solutions Ltd.";
    private static int totalEmployees = 0;

    private final int id;
    private String name;
    private String designation;

    Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public static void displayEmployeeDetails(Employee emp) {
        if (emp
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Ravi", "Manager");
        e1.displayEmployeeDetails();
        Employee.displayTotalEmployees();
    }
}
