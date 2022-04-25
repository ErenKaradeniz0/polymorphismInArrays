package SecondTermWeek9;

public class Main {
    public static void main(String[] args) {
        double sumProduct = 0;
        double sumService=0;
        Item[] items=new Item[4];
        items[0]= new Product("Iphone",10000,20);
        items[1]= new Service("Repair of Screen",4000,2);
        items[2]= new Product("Macbook",30000,10);
        items[3]= new Service("Battery Power",1000,2);
        for (Item item : items) {
            if(item instanceof Product){
                sumProduct+= item.ComputeTaxedPrice();
            }
            else{
                sumService+=item.ComputeTaxedPrice();
            }

        }
        System.out.println("total taxed price of product : "+sumProduct);
        System.out.println("total taxed price of service : "+sumService);
    }
}
