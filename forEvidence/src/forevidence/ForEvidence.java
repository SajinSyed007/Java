
package forevidence;

import java.util.Scanner;


public class ForEvidence {

  
    public static void main(String[] args) {
        
        //Create a program that reads a sequence of integer until a neg and sum the positive integer
        
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
          
          
  
