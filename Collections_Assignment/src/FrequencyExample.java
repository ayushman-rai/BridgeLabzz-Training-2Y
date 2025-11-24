import java.util.*;

public class FrequencyExample {
    public static Map<String,Integer> frequency(List<String> list) {
        Map<String,Integer> freq = new HashMap<>();
        for (String s : list) freq.put(s, freq.getOrDefault(s, 0) + 1);
        return freq;
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("apple","banana","apple","orange");
        System.out.println(frequency(input)); // {apple=2, banana=1, orange=1}
    }
}
