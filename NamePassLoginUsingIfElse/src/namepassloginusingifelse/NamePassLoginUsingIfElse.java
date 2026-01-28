package namepassloginusingifelse;

import java.util.Scanner;


public class NamePassLoginUsingIfElse {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter User name : ");
        String userName = input.nextLine();
        
        if (userName.equalsIgnoreCase("Sajin")){
           System.out.println("Enter Password : ");
        String password = input.nextLine();
        
        if(password.equals("Sajin007")){
         System.out.println("Welcome " + userName);
        }
        else{
            System.out.println("Password is incorrect.");
        }
        
      }
        else {
            System.out.println("User name is incorrect.");
    }
    
    }
}
