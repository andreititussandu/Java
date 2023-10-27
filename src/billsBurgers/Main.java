package billsBurgers;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", 3.56, "White", "Beef");
        hamburger.addAddition1("Tomato", 0.27);
        hamburger.addAddition2("Lettuce", 0.75);
        hamburger.addAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger(5.67, "Bacon");
        healthyBurger.addAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addAddition3("Should not do this", 50.53);
        System.out.println("Total Deluxe Burger price is " + db.itemizeHamburger());
    }
}
