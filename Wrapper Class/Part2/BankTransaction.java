class BankTransaction {
    public static double remainingLimit(Double limit, double used) {
        if (limit == null) return 0.0;  // null-safe wrapper handling
        return limit - used;
    }

    public static void main(String[] args) {
        System.out.println("=== 6. Bank Transaction Limits ===");
        System.out.println("Remaining Limit (valid): " + remainingLimit(5000.0, 1200));
        System.out.println("Remaining Limit (null): " + remainingLimit(null, 500));
        System.out.println();
    }
}