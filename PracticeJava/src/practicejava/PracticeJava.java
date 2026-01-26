package practicejava;

import java.util.Scanner;

public class PracticeJava {

    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//        System.out.print("Input first number : ");
//         int n1 = input.nextInt();
//        
//        
//        System.out.print("Input seocnd number : ");
//         int n2 = input.nextInt();
//        
//   
//        System.out.println("Result is " + (n1 + n2));



        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = input.nextLine();

        System.out.println("Welcome Hero " + name + ".");
    }

}
