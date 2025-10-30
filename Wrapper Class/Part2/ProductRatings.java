import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class ProductRatings {
    public static void main(String[] args) {
        System.out.println("=== 8. Product Ratings Analyzer ===");
        int[] oldRatings = {5, 4, 3};
        ArrayList<Integer> newRatings = new ArrayList<>(Arrays.asList(4, null, 5, 2));

        ArrayList<Integer> allRatings = new ArrayList<>();
        for (int r : oldRatings) allRatings.add(r);
        allRatings.addAll(newRatings);

        List<Integer> validRatings = allRatings.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());

        double avg = validRatings.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        System.out.println("All ratings: " + allRatings);
        System.out.println("Valid ratings: " + validRatings);
        System.out.println("Average rating: " + avg);
        System.out.println();
    }
}