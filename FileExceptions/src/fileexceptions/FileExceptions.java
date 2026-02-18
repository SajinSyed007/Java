package fileexceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileExceptions {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\Admin\\Desktop\\javaExceptions\\javaFile.txt");

//        try {
//            PrintWriter pw = new PrintWriter(file);
//            
//            pw.write("HI, I can count from 1 to 100. Here we go... \n");
//
//            for (int i = 1; i <= 100; i++) {
//                
//            pw.println(i);
//        }
//            
//            pw.close();
//
//        } catch (Exception e) {
//        }
//        try {
//            Scanner   s = new Scanner(file);
//             while (s.hasNext()) {
//            System.out.println(s.nextLine());
//        }
//
//        s.close();
//            
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(FileExceptions.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        
                 
        try {
          Scanner  s = new Scanner(file);
            while (s.hasNext()) {
         System.out.println(s.nextLine());
         
         
        } 
            s.close();

            }catch (FileNotFoundException ex) {
            Logger.getLogger(FileExceptions.class.getName()).log(Level.SEVERE, null, ex);
        }
 
    }

}
