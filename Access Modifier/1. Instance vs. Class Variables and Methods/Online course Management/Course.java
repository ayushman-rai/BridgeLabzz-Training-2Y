public class Course {
    String courseName;
    int duration; // in months
    double fee;
    static String instituteName = "Tech Academy"; // shared among all courses

    // Constructor
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method
    void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration +
                " months, Fee: " + fee + ", Institute: " + instituteName);
    }

    static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 3, 5000);
        Course c2 = new Course("Web Development", 4, 6500);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName("Code Crew Institute");
        System.out.println("\nAfter updating institute name:\n");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
