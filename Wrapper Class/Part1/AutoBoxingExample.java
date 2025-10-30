import java.util.ArrayList;

public class AutoBoxingExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // Auto-boxing
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(10);
        list.add(15);

        int sum = 0;
        // Auto-unboxing
        for (int num : list) {
            sum += num;
        }

        System.out.println("Sum of numbers = " + sum);
    }
}
