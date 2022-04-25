package SecondTermWeek9;

public class Product extends Item {
    Product(String name, double price, int amount) {
        super(name, price, amount);

    }

    double ComputeTaxedPrice() {
        return  total + (total * 0.18);
    }
}
