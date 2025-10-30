import java.util.ArrayList;

class WrapperPerformance {
    public static void main(String[] args) {
        System.out.println("=== 11. Performance Impact of Wrapper Classes ===");
        int n = 1_000_000;

        long start1 = System.currentTimeMillis();
        int[] arr1 = new int[n];
        int sum1 = 0;
        for (int i = 0; i < n; i++) {
            arr1[i] = i;
            sum1 += arr1[i];
        }
        long end1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        ArrayList<Integer> list = new ArrayList<>(n);
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            list.add(i);
            sum2 += list.get(i);
        }
        long end2 = System.currentTimeMillis();

        System.out.println("Primitive int[] time: " + (end1 - start1) + " ms, Sum: " + sum1);
        System.out.println("ArrayList<Integer> time: " + (end2 - start2) + " ms, Sum: " + sum2);
    }
}