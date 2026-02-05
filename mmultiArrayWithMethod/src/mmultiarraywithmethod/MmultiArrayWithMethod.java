
package mmultiarraywithmethod;

 public class MmultiArrayWithMethod {

  
    public static void main(String[] args) {
        
        int numbers [][] = {{1,2,3},{4,5,6},{7,8,9}};
        
            sumMultiArray(numbers);
    }
    
        public static void sumMultiArray(int[][] myArray) {
            
            int sum = 0;
            
                for(int[] row : myArray){
                    for(int col : row) {
                        sum += col;
                    }
                }
            System.out.println(sum);
     }
}
