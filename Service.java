package SecondTermWeek9;

public class Service extends Item {


    Service(String name, double price, int amount) {
        super(name, price, amount);
    }

    double ComputeTaxedPrice() {
        return total + (total * 0.01);

    }
}



