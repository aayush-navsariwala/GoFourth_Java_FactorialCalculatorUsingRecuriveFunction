import java.util.Scanner;

public class FactorialCalculator 
{
    //Recursive method to calculate factorial
    public static long calculateFactorial(int n) 
    {
        //Base case: factorial of 0 is 1
        if (n == 0) 
        {
            return 1;
        }
        //Recursive case: n * (n-1)!
        return n * calculateFactorial(n - 1);
    }

    //Main method
    public static void main(String[] args) 
    {
        //Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        //Initialise the number with an invalid value
        int number = -1;

        //Loop until valid input is provided
        while (true) 
        {
            System.out.print("Enter a non-negative integer: ");

            //Check if input is a valid integer
            if (scanner.hasNextInt()) 
            {
                //Read the user input
                number = scanner.nextInt();
                
                //Check if the input is positive
                if (number < 0) 
                {
                    System.out.println("Error: Please enter a non-negative integer.");
                } 
                else 
                {
                    //Exits the loop if valid input is received
                    break; 
                }
            } 
            else 
            {
                //Input is not an integer
                System.out.println("Error: Invalid input. Please enter a valid non-negative integer.");
                //Consume the invalid input to prevent an infinite loop
                scanner.next(); 
            }
        }
        //Calculate the factorial using recursion
        long result = calculateFactorial(number);
        
        //Display the result
        System.out.println("Factorial of " + number + " is: " + result);

        //Close the scanner
        scanner.close();
    }
}