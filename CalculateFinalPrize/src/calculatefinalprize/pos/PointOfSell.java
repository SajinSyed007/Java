package calculatefinalprize.pos;

public class PointOfSell {

    public double prizePay(double proPrice, double proCount) {

        double realPrice = proPrice * proCount;
        double discountedPrice = 0;

        if (realPrice <= 100) {
            return discountedPrice = realPrice - (realPrice * 0.02);
        } else if (realPrice <= 200) {
            return discountedPrice = realPrice - (realPrice * 0.03);
        } else if (realPrice <= 400) {
            return discountedPrice = realPrice - (realPrice * 0.04);
        } else {
            return discountedPrice = realPrice - (realPrice * 0.05);
        }

    }

}
