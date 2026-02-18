
package vehicle.io;




public class Truck extends vehicle.VehiCle {
    
    public int weight;

    public Truck() {
    }

    public Truck(int weight) {
        this.weight = weight;
    }

    public Truck(int weight, int speed, double regularPrice, String color) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }
    
    @Override
    public double getSalePrice() {
        
        if(weight > 2000){
            return regularPrice-(regularPrice*0.1);
        }
        else{}
        return super.getSalePrice(); 
    }

    
}
