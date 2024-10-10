// File name: CommandLineDemo.java

public class practicle3 {
    public static void main(String[] args) {
        // Check if there are any command-line arguments
        if (args.length > 0) {
            System.out.println("Command-line arguments:");
            
            // Loop through and print each command-line argument
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + (i + 1) + ": " + args[i]);
            }
        } else {
            System.out.println("No command-line arguments found.");
        }
    }
}

