public class HelloApp {
    public static void main(String[] args) {
        // Check if the user provided an argument
        if (args.length > 0) {
            // Use the first argument provided
            System.out.println("Hello, " + args[0] + "!");
        } else {
            // Fallback if no argument is given
            System.out.println("Hello, World!");
        }
    }
}