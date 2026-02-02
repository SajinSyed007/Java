
package arraylearning;

import java.util.Arrays;


public class ArrayLearning {

    
    public static void main(String[] args) {
        
        String studentsName[] = new String[14];
        
        int studentsAge[] = new int[14];
        
        int numbers[] = {10,20,30,40,50,60,70,80,90};
        
        
        studentsName[0] = "Badrul";
        studentsName[1] = "Hasan";
        studentsName[6] = "Emon";
        
        studentsAge[0] = 20;
        studentsAge[1] = 21;
        studentsAge[3] = 22;
        
        
        System.out.println(Arrays.toString(studentsName));
        System.out.println(Arrays.toString(studentsAge));
        
        
        
        System.out.println(studentsAge[0]+" "+studentsName[0]);
        
        
        
                
    }
    
}
