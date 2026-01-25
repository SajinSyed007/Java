package countingsecondminute;

import java.util.Scanner;

public class CountingSecondMinute {
            
    
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
    System.out.print("Enter second ");
    
    int time = scanner.nextInt();
    
    int hour = time / 3600;
    int minute = (time%3600)/ 60;
    int second = time % 60;
    
    System.out.println(hour+" Hour "+ minute + " Minutes "+ second+" Seconds");
        
    }
    
}
