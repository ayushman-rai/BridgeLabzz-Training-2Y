import java.util.*;

public class EmployeeAges {
    public static void main(String[] args) {
        int[] ages = {25, 30, 22, 45, 28};
        ArrayList<Integer> list = new ArrayList<>();

        for (int age : ages) {
            list.add(age);  // auto-boxing
        }

        int youngest = Collections.min(list);
        int oldest = Collections.max(list);

        System.out.println("Employee ages: " + list);
        System.out.println("Youngest: " + youngest);
        System.out.println("Oldest: " + oldest);
    }
}
