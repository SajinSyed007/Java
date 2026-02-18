
package vehicle;

import vehicle.io.Truck;


public class VehiCle {
     
    public int speed;
    public double regularPrice;
    public String color;

    public VehiCle() {
    }

    public VehiCle(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }
    
    public double getSalePrice(){
        return regularPrice;
    }
    
    public static void main(String[] args) {
        
        Truck truck = new Truck();
         truck.regularPrice = 10000;
         truck.weight = 3000;
         
         System.out.println(truck.getSalePrice());
       
    }
    
}
