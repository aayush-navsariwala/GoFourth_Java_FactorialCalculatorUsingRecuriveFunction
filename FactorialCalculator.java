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
}