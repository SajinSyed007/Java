
package forevidence;

import forevidence.vehi.Truck;


public class testVehicle {
    
    public static void main(String[] args) {
        
        Truck truck = new Truck(3000, 1000);
        
        System.out.println("NEW PRICE : " + truck.getSalePrice());
    }
    
}
