// Section B
// Objective: Practice number theory (primes, factorial, Fibonacci),
// digit sum logic, and counting using loops.

public class SectionB {

    // 1. Is Prime?
    public static boolean isPrime(int n) {
        if (n < 2) return false;        // 0, 1, negatives are not prime
        if (n == 2) return true;
        if (n % 2 == 0) return false;   // even numbers > 2 are not prime

        for (int i = 3; i * i <= n; i += 2) { // check odd divisors up to sqrt(n)
            if (n % i == 0) return false;
        }
        return true;
    }

    // 2. Factorial of a Number (n!)
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial not defined for negative numbers");
        }
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // 3. Nth Fibonacci Number (0,1,1,2,3,5,...)
    public static long nthFibonacci(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be non-negative");
        if (n == 0) return 0;
        if (n == 1) return 1;

        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    // 4. Nth Prime Number
    public static int nthPrime(int n) {
        if (n <= 0) throw new IllegalArgumentException("n must be positive");

        int count = 0;
        int num = 1;
        while (count < n) {
            num++;
            if (isPrime(num)) {
                count++;
            }
        }
        return num;
    }

    // 5. Number of Primes in a Specified Range [start, end]
    public static int countPrimesInRange(int start, int end) {
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) count++;
        }
        return count;
    }

    // 6. Count of All Digits in a Number
    // e.g., 12345 -> 5 digits; 0 -> 1 digit
    public static int countDigits(long n) {
        n = Math.abs(n);
        if (n == 0) return 1;
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;       // remove last digit
        }
        return count;
    }

    // 7. Count of Unique Digits in a Number (distinct digits used)
    // e.g., 112233 -> digits {1,2,3} -> 3 unique
    public static int countUniqueDigits(long n) {
        n = Math.abs(n);
        boolean[] seen = new boolean[10];

        if (n == 0) {
            seen[0] = true;
        } else {
            while (n > 0) {
                int d = (int)(n % 10);
                seen[d] = true;
                n /= 10;
            }
        }

        int count = 0;
        for (boolean b : seen) {
            if (b) count++;
        }
        return count;
    }

    // 8. Count of Non-Repeated Digits in a Number
    // digits that appear exactly once
    public static int countNonRepeatedDigits(long n) {
        n = Math.abs(n);
        int[] freq = new int[10];

        if (n == 0) {
            freq[0]++;
        } else {
            while (n > 0) {
                int d = (int)(n % 10);
                freq[d]++;
                n /= 10;
            }
        }

        int count = 0;
        for (int f : freq) {
            if (f == 1) count++;
        }
        return count;
    }

    // 9. digitSum: Sum of All Digits in a Number
    public static int digitSum(long n) {
        n = Math.abs(n);
        int sum = 0;
        if (n == 0) return 0;
        while (n > 0) {
            int d = (int)(n % 10);
            sum += d;
            n /= 10;
        }
        return sum;
    }

    // 10. digitSum Even: Sum of Even Digits Only
    public static int digitSumEven(long n) {
        n = Math.abs(n);
        int sum = 0;
        if (n == 0) return 0;
        while (n > 0) {
            int d = (int)(n % 10);
            if (d % 2 == 0) sum += d;
            n /= 10;
        }
        return sum;
    }

    // 11. digitSum Odd: Sum of Odd Digits Only
    public static int digitSumOdd(long n) {
        n = Math.abs(n);
        int sum = 0;
        if (n == 0) return 0;
        while (n > 0) {
            int d = (int)(n % 10);
            if (d % 2 != 0) sum += d;
            n /= 10;
        }
        return sum;
    }

    // 12. digitSum Opt: Sum of Even or Odd Digits (choose using a flag)
    // flag = 'E' -> sum even digits; flag = 'O' -> sum odd digits
    public static int digitSumOpt(long n, char flag) {
        n = Math.abs(n);
        int sum = 0;
        if (n == 0) return 0;

        boolean sumEven = (flag == 'E' || flag == 'e');

        while (n > 0) {
            int d = (int)(n % 10);
            if (sumEven && d % 2 == 0) {
                sum += d;
            } else if (!sumEven && d % 2 != 0) {
                sum += d;
            }
            n /= 10;
        }
        return sum;
    }

    // You can reuse isPrime() from here or from SectionA class if you keep one big file.
}
