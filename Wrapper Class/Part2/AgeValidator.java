class AgeValidator {
    // Method to check if age is valid integer and >= 18
    public static boolean isValidAge(String input) {
        try {
            int age = Integer.parseInt(input);
            return age >= 18;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("=== 3. User Input Validation ===");
        System.out.println("Input: 20 → " + isValidAge("20"));
        System.out.println("Input: abc → " + isValidAge("abc"));
        System.out.println("Input: 15 → " + isValidAge("15"));
        System.out.println();
    }
}