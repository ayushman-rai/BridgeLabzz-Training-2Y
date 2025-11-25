// Objective: Use of division / and modulo % operators, and introduction to
// counting even/odd using conditional logic.

public class SectionA {

    // 1. Is Even?
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // 2. Is Odd?
    public static boolean isOdd(int n) {
        return n % 2 != 0;  // or !isEven(n);
    }

    // 3. Return Last Digit of the Given Number
    public static int lastDigit(int n) {
        n = Math.abs(n);      // handle negative numbers
        return n % 10;        // remainder when divided by 10
    }

    // 4. Return Second Last Digit of the Given Number
    // If number has only 1 digit, return -1
    public static int secondLastDigit(int n) {
        n = Math.abs(n);
        if (n < 10) return -1;  // no second last digit
        return (n / 10) % 10;   // remove last digit, then take last of remaining
    }

    // 5. Sum of Last Digits of Two Given Numbers
    public static int sumOfLastDigits(int a, int b) {
        int lastA = Math.abs(a) % 10;
        int lastB = Math.abs(b) % 10;
        return lastA + lastB;
    }

    // 6. Is N an Exact Multiple of M?
    public static boolean isExactMultiple(int n, int m) {
        if (m == 0) return false;   // division by zero not allowed
        return n % m == 0;
    }

    // 7. Of Given 5 Numbers, How Many Are Even?
    public static int countEvenOf5(int a, int b, int c, int d, int e) {
        int count = 0;
        if (isEven(a)) count++;
        if (isEven(b)) count++;
        if (isEven(c)) count++;
        if (isEven(d)) count++;
        if (isEven(e)) count++;
        return count;
    }

    // 8. Of Given 5 Numbers, How Many Are Odd?
    public static int countOddOf5(int a, int b, int c, int d, int e) {
        int count = 0;
        if (isOdd(a)) count++;
        if (isOdd(b)) count++;
        if (isOdd(c)) count++;
        if (isOdd(d)) count++;
        if (isOdd(e)) count++;
        return count;
    }

    // 9. Of 5 Numbers, Count How Many Are Even or Odd
    // returns an array: [evenCount, oddCount]
    public static int[] countEvenOddOf5(int a, int b, int c, int d, int e) {
        int even = 0, odd = 0;

        int[] nums = {a, b, c, d, e};
        for (int n : nums) {
            if (isEven(n)) even++;
            else odd++;
        }
        return new int[]{even, odd};
    }
}
