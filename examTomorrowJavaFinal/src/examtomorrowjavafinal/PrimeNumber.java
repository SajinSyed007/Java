
package examtomorrowjavafinal;

import java.util.Scanner;

public class PrimeNumber {
    
    public static void main(String[] args) {
        
        Scanner input = new  Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt(),
            count = 0;
            
        for (int i = 1; i <= number ; i++) {
                
            if(number % i == 0){
                count++;
            }
        }
        
        if(count == 2){
            System.out.println("It is a prime number.");
        }
        else{
            System.out.println("it is not a prime number.");
        }
        
    }
    
}
