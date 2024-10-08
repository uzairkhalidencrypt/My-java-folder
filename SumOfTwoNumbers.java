import java.util.Scanner; // Import the Scanner class

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for the first number
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt(); // Read the first number
        
        // Prompt the user for the second number
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt(); // Read the second number
        
        // Calculate the sum
        int sum = num1 + num2;
        
        // Display the sum
        System.out.println("Sum: " + sum);
        
        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
