
package examtomorrowjavafinal;

import java.util.Scanner;


public class SumUntillNegative {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
       System.out.println("Enter integer number : ");
       
       int input = scanner.nextInt();
       int sum = 0;
       while(input >= 0) {
        sum += input ;
          System.out.println("Enter integer number : ");
          input = scanner.nextInt(); 
      }
      
      scanner.close();
      System.out.println("The sum is : " + sum); 
    }
}
