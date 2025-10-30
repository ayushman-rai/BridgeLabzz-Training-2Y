import java.util.ArrayList;
import java.util.Collections;

class EmployeeData {
    public static void main(String[] args) {
        System.out.println("=== 5. Employee Data Processing ===");
        int[] ages = {25, 30, 22, 45, 28};
        ArrayList<Integer> ageList = new ArrayList<>();

        // Convert primitives → Wrapper
        for (int age : ages) {
            ageList.add(age);  // auto-boxing
        }

        System.out.println("Employee ages: " + ageList);
        System.out.println("Youngest: " + Collections.min(ageList));
        System.out.println("Oldest: " + Collections.max(ageList));
        System.out.println();
    }
}