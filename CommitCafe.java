public class CommitCafe {


    private static String barista = "Ziye Xu"; // STUDENT_TODO_1A: Change name
    private static String title = "Coffee Master";



    private static int cups = 0;

   public static void brew(String drink) {
        cups++;
        System.out.println(barista + " brewed a " + drink + "!");
        System.out.println("Total cups brewed: " + cups);
        System.out.println("[BOT CHECK] drink length = " + drink.length());
    }

    public static void printSummary() {
        System.out.println("[SUMMARY] " + barista + " brewed " + cups + " cups today.");
    }

    public static void main(String[] args) {
        brew("Espresso");
        brew("Latte");
        printSummary();
    }
}