package billsBurgers;

public class DeluxeBurger extends Hamburger{
    public DeluxeBurger(){
        super("Deluxe Burger", 14.54, "White", "Sausage&Bacon");
        super.addAddition1("Chips", 2.75);
        super.addAddition2("Drink", 1.81);
    }
    public void addAddition1(String name, double price){
        System.out.println("Cannot add more items");
    }
    public void addAddition2(String name, double price){
        System.out.println("Cannot add more items");
    }
    public void addAddition3(String name, double price){
        System.out.println("Cannot add more items");
    }
    public void addAddition4(String name, double price){
        System.out.println("Cannot add more items");
    }

}
