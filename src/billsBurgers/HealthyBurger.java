package billsBurgers;

public class HealthyBurger extends Hamburger{
    private String healthyAddition1Name;
    private double healthyAddition1Price;
    private String healthyAddition2Name;
    private double healthyAddition2Price;
    public HealthyBurger(double price, String meatType){
        super("Healthy Burger", price, "Brown Rye", meatType);
    }
    public void addHealthyAddition1(String name, double price){
        this.healthyAddition1Name=name;
        this.healthyAddition1Price=price;
    }
    public void addHealthyAddition2(String name, double price){
        this.healthyAddition2Name=name;
        this.healthyAddition2Price=price;
    }
    @Override
    public double itemizeHamburger() {
        double hamburgerPrice=super.itemizeHamburger();//fac asta pentru a chema metoda din clasa Hamburger, ca sa pot adauga si optiunile de acolo (healthyBurger.addAddition1)
        if(healthyAddition1Name!= null) {
            hamburgerPrice += healthyAddition1Price;
            System.out.println("Added " + healthyAddition1Name);
        }
        if(healthyAddition2Name!= null) {
            hamburgerPrice += healthyAddition2Price;
            System.out.println("Added " + healthyAddition2Name);
        }
        return hamburgerPrice;
    }
}
