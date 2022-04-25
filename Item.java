package SecondTermWeek9;

public class Item {
    String name;
    double price;
    int amount;
    double total;

    Item(String name, double price, int amount) {
        this.price = price;
        this.amount = amount;
        this.name = name;
        total=price*amount;
    }

    double ComputeTaxedPrice() {
        return total;
    }
}
