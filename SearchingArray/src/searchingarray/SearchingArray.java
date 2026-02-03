
package searchingarray;


public class SearchingArray {


    public static void main(String[] args) {
       
        int numbers[] = {14, 3, 19, 7, 12, 5, 18, 1, 9, 20, 4, 15, 8, 11, 2, 17, 6, 13, 10, 16};
        
        int search = 30;
        boolean status = false;
        
        for(int index = 0; index < numbers.length; index++){
            
                if(numbers[index] == search){
                    
                        System.out.println("Your searching number is in the list.");
                        status = true;
                        break;
               
                }
        
        }
        
        if(!status){
                System.out.println("Your number is not in the list.");
        }
        
        int result = linearSearch(numbers, search);
        System.out.println("The index of the number is " + result);
        
        
    }
    
    public static int linearSearch(int[] array, int searchNumber) {
    
            int result = -1;
            for(int index = 0; index < array.length; index++){
            
                if(array[index] == searchNumber){
                    result = index;
                    break;
                }
            
            }
     
            return result;
            
    }
    
    
}
