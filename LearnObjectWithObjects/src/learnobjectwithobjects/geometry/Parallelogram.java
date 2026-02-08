
package learnobjectwithobjects.geometry;


public class Parallelogram {
    
    public double base;
    
    public double height;
    
    public double wide;
    
    
        public double  getArea(){
        
            double result = base * height;
            
            return result;
            
        }
        
        public double  getPerimeter(){
        
            double result = 2*(base+wide);
            
            return result;
            
        }
    
}
