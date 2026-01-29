
package nameupperlower;

import java.util.Scanner;

public class NameUpperLower {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name : ");
        
        
        String name = input.next();
        
        String fName = name.substring(0,1).toUpperCase();
        String lName = name.substring(1).toLowerCase();
        
        String newName = fName + lName;
        
        System.out.println("Hello "+ newName);
        
    }
    
}
