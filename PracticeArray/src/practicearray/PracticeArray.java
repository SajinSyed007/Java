
package practicearray;

import java.util.Arrays;
import java.util.Scanner;



public class PracticeArray {

 
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("How many number do you want to compare?");
        int n = s.nextInt();
        
        int numbers[] = new int[n];
        
        for(int index = 0; index < n ; index++){
            
            System.out.println("Enter your " + (index+1)+ " number.");
            int userInput = s.nextInt();
            
            numbers[index] = userInput;
            
        }
        
        System.out.println("Final loop is " + Arrays.toString(numbers));
        findMaxNumber(numbers);
        findMinNumber(numbers);
        averageNumber(numbers);
        System.out.println("Array sorting result " + Arrays.toString(sort(numbers)));
        
    }
   
    public static void findMaxNumber(int[] numbers) {
        
        int max = 0;
        
        for(int item : numbers){
            if(item >= max){
                max = item;
            }
        }
        
        System.out.println("Max number is "+ max);
        
        
  
    }
      public static void findMinNumber(int[] numbers) {
        
      int min = numbers[0];
        
        for(int item : numbers){
            if(item <= min){
                min = item;
            }
        }
        
        System.out.println("Min number is "+ min);
 }
      public static void averageNumber(int[] numbers) {
        
          int size = numbers.length;
          double sum = 0;
        
        for(int item : numbers){
            
            sum += item;
            
            }
        
        double avg = sum / size;
        
        
        System.out.println("The average is: " + avg);
        }
        
       public static int[] sort(int[] array) {
        
        for (int i = 0; i < array.length - 1; i++){
            
            for(int j =0; j < array.length -1 -i; j++){
            
                    if (array[j] > array[j=1]){
                    
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    
                    }
               
            }
            
        
        
     }
        return array;
   
    }
      
}

