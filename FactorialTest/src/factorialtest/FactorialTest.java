package factorialtest;

import java.util.Scanner;

public class FactorialTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = input.nextInt();

        checkFactorial(number);
    }

    public static void checkFactorial(int number) {
 
        int factorial = 1;
        int i = 1;

        if (number <= 0) {
            System.out.println("Input a positive number !!!");
        } else {
            while (i <= number) {
                factorial *= i;
                i++;
            }
        }
        System.out.println("Factorial of " + number + " is " + factorial);
    }
}
