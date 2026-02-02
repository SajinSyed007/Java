
package learningmethod;


public class LearningMethod {

   
    public static void main(String[] args) {
        
    } 
    
   public static void checkPrimeNumber(int number){
   
       int firstNumber = 1;
       int count = 0;
       
       while(firstNumber <= number){
       
           if(number % firstNumber == 0){
           
           count += 1; }
           
           if (count == 2) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
           
           
       
       }
   }
    
    public static String checkOddEven(int number){
    
            if(number % 2 == 0){
                return number + " is a EVEN Number";
            }
            else {
                return number + " is a ODD Number";
            }
    
    }
  }

    
