import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Read the input number
        int N = scanner.nextInt();

        // Print the number
        System.out.println(N);

        // Close the scanner to release resources
        scanner.close();
    }
}
