package takingdatafromusermultiarray;

import java.util.Arrays;
import java.util.Scanner;

public class TakingDataFromUserMultiArray {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter Row Size : ");
        int rows = s.nextInt();

        System.out.print("Enter Column Size : ");
        int cols = s.nextInt();

        int numbers[][] = new int[rows][cols];

        for (int row = 0; row < numbers.length; row++) {

            for (int col = 0; col < numbers[row].length; col++) {
                System.out.println("Enter value for row " + (row + 1) + " and col " +(col + 1)+ " : ");

                int userInput = s.nextInt();
                numbers[row][col] = userInput;
               

            }

        }
        
        System.out.println("...........................................................................................................................");
        
 for(int row = 0; row < numbers.length; row++ ) {
     
     
            
            for(int col = 0; col < numbers[row].length; col++){
            
                System.out.print(numbers[row][col]+ " ");
                
            }
          
                    
            System.out.println("");
            
                    

        } 
    }
}
