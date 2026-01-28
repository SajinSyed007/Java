
package nestedifelse;

import java.util.Scanner;


public class NestedIfElse {

    
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.println("Input your BMI: ");
        float bmi = input.nextFloat();
        
        if(bmi>=30.0){
             System.out.println("Obese");
             
       }
        else if(bmi>=25.0){
        System.out.println("Overweight");}
        
        else if(bmi>=18.5){
        System.out.println("Normal");}
        
        else{
            System.out.println("Underweight");
        }
    }
    
}
