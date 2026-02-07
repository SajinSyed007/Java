
package learnobjectwithobjects;

import java.util.Scanner;
import learnobjectwithobjects.geometry.Circle;
import learnobjectwithobjects.geometry.Rectangle;


public class LearnObjectWithClasses {

   
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        
        System.out.println("Enter the radius : ");
        double radius = s.nextDouble();
        
        circle.radius = radius;
        System.out.println("The area of the circle is " + circle.getArea());
        System.out.println("The perimeter of the circle is " + circle.getPerimeter());
     
       
        System.out.println(".......................................................");
        
        
        System.out.println("Enter the length : ");
        double length = s.nextDouble();
        System.out.println("Enter the width : ");
        double width = s.nextDouble();
        
        rectangle.length = length;
        rectangle.width = width;
        
        System.out.println("The area of the rectangle is " + rectangle.getArea());
        System.out.println("The perimeter of the rectangle is " + rectangle.getPerimeter());
       
        
   
    }
    
}
