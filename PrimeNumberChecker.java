import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check if the number is prime
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        
        // Close the scanner object to prevent memory leak
        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        // A number less than or equal to 1 is not prime
        if (num <= 1) {
            return false;
        }

        // Check divisibility from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // num is divisible by i, so it's not prime
            }
        }

        // If no divisors are found, the number is prime
        return true;
    }
}
