
package learnobjectwithobjects;

import java.util.Scanner;
import javax.swing.Spring;
import learnobjectwithobjects.geometry.Circle;
import learnobjectwithobjects.geometry.Parallelogram;
import learnobjectwithobjects.geometry.Rectangle;
import learnobjectwithobjects.geometry.Square;


public class LearnObjectWithClasses {

   
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        Parallelogram parallelogram = new Parallelogram();
        
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
        
        
         System.out.println(".......................................................");
         
         
         System.out.println("Enter the side: ");
        double side = s.nextDouble();
      
        square.side = side;
        
        System.out.println("The area of the square is " + square.getArea());
        System.out.println("The perimeter of the square is " + square.getPerimeter());
        
        
        System.out.println(".......................................................");
        
        
        System.out.println("Enter the base : ");
        double base = s.nextDouble();
        System.out.println("Enter the height : ");
        double height = s.nextDouble();
        System.out.println("Enter the wide : ");
        double wide = s.nextDouble();
        
        parallelogram.base = base;
        parallelogram.height = height;
        parallelogram.wide = wide;
        
        System.out.println("The area of the paralellogram is " + parallelogram.getArea());
        System.out.println("The perimeter of the paralellogram is " + parallelogram.getPerimeter());
        
        System.out.println(".......................................................");
       
        
   
    }
    
}
