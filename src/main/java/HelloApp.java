public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // String.join automatically handles commas between names
            // No trailing comma is ever added!
            String finalNames = String.join(", ", args);

            System.out.println("Hello, " + finalNames + "!");
        }
    }
}