
package forevidence2;

import java.util.Arrays;
import java.util.Scanner;


public class lowestHighest {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int nums[] = new int[5];
            
        for(int index = 0; index < nums.length; index++){
            System.out.println("Enter Number : ");
            nums[index] = s.nextInt();
        }
        
        System.out.println("All Numbers : " + Arrays.toString(nums));
        
        int max = nums[0];
        int min = nums[0];
        
        for (int index = 1; index < nums.length; index++) {
            
            if(nums[index] > max){
                max = nums[index];
            }
            
            if (nums[index] < min){
                min = nums[index];
            }            
            
        }
        
        System.out.println("Max Number is : " + max);
        System.out.println("Min Number is : " + min);
    }
}
