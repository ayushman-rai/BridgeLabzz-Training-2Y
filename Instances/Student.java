public class Student {
    private static String universityName = "National Institute of Technology";
    private static int totalStudents = 0;

    private final int rollNumber;
    private String name;
    private char grade;

    // Constructor using 'this'
    Student(int rollNumber, String name, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    // Static method
    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    // Display method
    void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName + ", Roll No: " + rollNumber +
                    ", Name: " + name + ", Grade: " + grade);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "XYZ", 'A');
        s1.displayStudentDetails();
        Student.displayTotalStudents();
    }
}
