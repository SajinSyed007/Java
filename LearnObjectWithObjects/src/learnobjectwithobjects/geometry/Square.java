
package learnobjectwithobjects.geometry;


public class Square {
    
        public double side;
        
        
            public double getArea(){
            
                double result = Math.pow(side, 2);
                
                return result;
            }
            
            public double getPerimeter(){
            
                double result = side * 4;
                
                return result;
            }
}
