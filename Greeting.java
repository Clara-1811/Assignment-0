import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create Scanner object

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();  // Read user input

        System.out.println("Hello, " + name + "!");  // Output greeting

        scanner.close();; 
        // Close scanner
}
}