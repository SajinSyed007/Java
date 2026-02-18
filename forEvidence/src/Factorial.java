
import java.util.Scanner;




public class Factorial {
    
    public static void main(String[] args) {
//        
//      int factorial = 1;
//      int chance = 5;
//        
//        while(chance <= 5) {
//            
//            factorial *= chance;
//            chance++;
//        } 
//        System.out.println("Factorial of 5 is " + factorial);
//
//    }
//}
    

//        int factorial = 1;
//
//       for (int i=1; i<=5; i++){
//           
//           factorial *= i;
//       }
//       
//        System.out.println("Factorial of 5 is " + factorial);
//        
//    }
//}  



         Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int input = scanner.nextInt();
        
        int factorial = 1;
        
            for (int i=1; i<=input; i++){
          
           factorial *= i;
      }
      
       System.out.println("Factorial of "+ input + " is " + factorial);
        
    }
}   
