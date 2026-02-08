package calculatefinalprize;

import calculatefinalprize.pos.PointOfSell;
import java.util.Scanner;

public class CalculateFinalPrize {

    public static void main(String[] args) {

        
        // Taking input from customers
        Scanner s = new Scanner(System.in);
        PointOfSell sell = new PointOfSell();

        System.out.println("Enter the product's prize : ");
        double proPrize = s.nextDouble();

        System.out.println("Enter the product's number : ");
        double proUnit = s.nextDouble();
        
        
        //Discount show
        if(proPrize*proUnit <= 100){
            System.out.println("Your Discount is 2%.");
        }
        
        else if(proPrize*proUnit <= 200){
            System.out.println("Your Discount is 3%.");
        }
        
        else if(proPrize*proUnit <= 400){
            System.out.println("Your Discount is 4%.");
        }
        
        else{
            System.out.println("Your Discount is 5%.");
        }
        
        
        //final prize calculation through calling the method
        System.out.println("You have to pay : " + sell.prizePay(proPrize, proUnit)+ " Tk.");

    }

}
