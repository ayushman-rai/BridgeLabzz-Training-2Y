class GameScoreboard {
    public static void main(String[] args) {
        System.out.println("=== 9. Game Scoreboard ===");
        Integer[] scores = {100, null, 250, 300, null, 150};
        int notPlayed = 0, total = 0;

        for (Integer s : scores) {
            if (s == null)
                notPlayed++;
            else
                total += s;  // auto-unboxing
        }

        System.out.println("Players who haven’t played: " + notPlayed);
        System.out.println("Total valid score: " + total);
        System.out.println();
    }
}