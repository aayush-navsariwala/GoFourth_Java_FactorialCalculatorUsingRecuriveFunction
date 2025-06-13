import java.util.Scanner;

public class FactorialCalculator {

    //Recursive method to calculate factorial
    public static long calculateFactorial(int n) {
        //Base case: factorial of 0 is 1
        if (n == 0) {
            return 1;
        }
        //Recursive case
        return n * calculateFactorial(n - 1);
    }

    //Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Prompt the user for input
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        //Validate user input
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        }
        else 
        {
            long result = calculateFactorial(number);
            System.out.println("Factorial of " + number + " is:" + result);
        }

        scanner.close();
    }
}