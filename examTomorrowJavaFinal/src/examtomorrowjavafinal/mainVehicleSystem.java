
package examtomorrowjavafinal;

import examtomorrowjavafinal.vehicle.Truck;


public class mainVehicleSystem {

    public static void main(String[] args) {
        
        Truck truck = new Truck(3000, 200);
        System.out.println("You have to pay : " + truck.getSalePrice());
        
    }
   
}
