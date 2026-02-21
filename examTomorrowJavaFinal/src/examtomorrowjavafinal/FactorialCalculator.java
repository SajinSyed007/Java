
package examtomorrowjavafinal;

import java.util.Scanner;


public class FactorialCalculator {

  
    public static void main(String[] args) {
       
                       //From user 

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the number : ");
//        int input = scanner.nextInt();
//        
//        int factorial = 1;
//        
//            for (int i=1; i<=input; i++){
//          
//           factorial *= i;
//      }
//      
//       System.out.println("Factorial of "+ input + " is " + factorial);
//  
//    }
//    
//}


                        //Just Using for loop
                        
      int factorial = 1;

       for (int i=1; i<=5; i++){
          
           factorial *= i;
       }
       
        System.out.println("Factorial of 5 is " + factorial);
        
    }
}  
