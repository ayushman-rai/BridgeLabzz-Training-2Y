import java.util.ArrayList;

class StudentMarks {
    public static void main(String[] args) {
        System.out.println("=== 10. Student Marks Report ===");
        Object[] marks = {"85", 95, Integer.valueOf(88), "null", "abc"};
        ArrayList<Integer> validMarks = new ArrayList<>();

        for (Object m : marks) {
            try {
                if (m == null || m.equals("null")) continue;
                if (m instanceof Integer) validMarks.add((Integer) m);
                else if (m instanceof String) validMarks.add(Integer.parseInt((String) m));
            } catch (NumberFormatException e) {
            }
        }

        double avg = validMarks.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        System.out.println("Valid marks: " + validMarks);
        System.out.println("Average marks: " + avg);
        System.out.println();
    }
}