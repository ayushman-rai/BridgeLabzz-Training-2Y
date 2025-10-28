public class Employee {
    public int employeeID;      
    protected String department;
    private double salary;      

    Employee(int id, String dept, double sal) {
        employeeID = id;
        department = dept;
        salary = sal;
    }

    public void setSalary(double newSalary) {
        salary = newSalary;
    }

    public double getSalary() {
        return salary;
    }

    public void displayEmployee() {
        System.out.println("Employee ID: " + employeeID + 
                           ", Department: " + department + 
                           ", Salary: ₹" + salary);
    }
}

class Manager extends Employee {

    Manager(int id, String dept, double sal) {
        super(id, dept, sal);
    }

    void showManagerDetails() {
        System.out.println("Accessing from subclass:");
        System.out.println("Employee ID: " + employeeID);  
        System.out.println("Department: " + department);  
    }

    public static void main(String[] args) {
        Manager m1 = new Manager(101, "IT", 80000);
        m1.displayEmployee();
        m1.setSalary(90000);
        System.out.println("Updated Salary: ₹" + m1.getSalary());
        m1.showManagerDetails();
    }
}
