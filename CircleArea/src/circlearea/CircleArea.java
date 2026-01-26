package circlearea;

import java.util.Scanner;

public class CircleArea {

    public static void main(String[] args) {

//        float radius;
//        double area;
//        double perimeter;
//        radius = 5;
//        
//        area = 3.1416 * radius * radius;
//        perimeter = 2 * 3.1416 * radius;
//         
//        System.out.println("Area of the circle is " + area);
//        System.out.println("Perimeter of the circle is " + perimeter);



        Scanner input = new Scanner(System.in);
        float area;
        System.out.print("Please enter radius : ");
        float radius = input.nextFloat();

        area = (float) 3.1416 * radius * radius;
        double perimeter = 2 * 3.1416 * radius;
        System.out.println("Area of the circle is " + area);
        System.out.println("Perimeter of the circle is " + perimeter);

    }

}
