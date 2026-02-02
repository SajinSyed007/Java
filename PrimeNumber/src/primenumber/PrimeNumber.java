
package primenumber;

import java.util.Scanner;


public class PrimeNumber {

  
    public static void main(String[] args) {
       
         Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt(),
                count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
    }
}
