import java.util.Scanner;

public class CheckWhetherTheStudentCanVote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number of students
        int n = input.nextInt();

        int[] arr = new int[n];

        // Take ages of students
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        input.close();

        // Check if each student can vote
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 18) {
                System.out.println("The student with the age " + arr[i] + " can vote");
            } else {
                System.out.println("The student with the age " + arr[i] + " cannot vote");
            }
        }
    }
}
