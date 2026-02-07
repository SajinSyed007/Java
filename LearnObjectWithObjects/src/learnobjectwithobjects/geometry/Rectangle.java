
package learnobjectwithobjects.geometry;


public class Rectangle {
    

   public double length;
   
   public double width;
   
   
    public double getArea() {
        
        double result = length * width;
        
        return result;
        
    }
    
      public double getPerimeter() {
        
        double result = 2 * (length + width);
        
        return result;
      }
    
    
}
