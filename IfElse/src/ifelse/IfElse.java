
package ifelse;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        float radius = input.nextFloat();
        float areaOfCircle;
        
        if(radius <= 0){
            
            System.out.println("Incorrect radius.");
        
    }
        else{
            
            areaOfCircle = (float) (Math.PI * Math.pow(radius, 2));
            System.out.println("Area of the circle is " + areaOfCircle);
            
        }
    }    
    
}
