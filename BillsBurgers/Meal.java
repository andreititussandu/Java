package BillsBurgers;

public class Meal {
    Burger burger;
    SideItem side;
    Drink drink;

    public Meal() {
        this.burger=new Burger("Regular",5);
        this.side=new SideItem("Fries", 3);
        this.drink=new Drink("Coke","Small",2);
    }
    public Meal(Burger burger, SideItem side, Drink drink) {
        this.burger = burger;
        this.side = side;
        this.drink = drink;
    }

    public Burger getBurger() {
        return burger;
    }

    public SideItem getSide() {
        return side;
    }

    public Drink getDrink() {
        return drink;
    }

//    public String setDrinkSize(String size){
//        drink.setSize(size);_
//    }

    public double printTotal(){
        return burger.getBasePrice()+ side.getPrice()+ drink.getAdjustedPrice("Large");
    }
}

class Burger{
    private String type;
    private double basePrice;
    private String extraTopping1;
    private String extraTopping2;
    private String extraTopping3;

    public Burger(String type, double basePrice) {
        this.type = type;
        this.basePrice=basePrice;
    }
    public Burger(){
        this.type="Deluxe Burger";
        this.basePrice=7;
    }

    public String getType() {
        return type;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void addExtraTopping1(String extraTopping1, double extraToppingPrice1){
        this.basePrice+=extraToppingPrice1;
        System.out.printf("Burger price with added %s is: %f",extraTopping1,basePrice);
    }
    public void addExtraTopping2(String extraTopping2, double extraToppingPrice2){
        this.basePrice+=extraToppingPrice2;
        System.out.printf("Burger price with added %s is: %f",extraTopping2, basePrice);
    }
    public void addExtraTopping3(String extraTopping3, double extraToppingPrice3){
        this.basePrice+=extraToppingPrice3;
        System.out.printf("Burger price with added %s is: %f",extraTopping3, basePrice);
    }

//    public double getAdjustedPrice(){
//
//    }
}

class Drink{
    private String type;
    private String size;
    private double price;

    public Drink(String type, String size, double price) {
        this.type = type;
        this.size = size;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public double getAdjustedPrice(String size){
        switch (size){
            case "Small":
                return this.price*0.75;
            case "Medium":
                return this.price;
            case "Large":
                return this.price*1.5;
            default:
                return -1;
        }
    }
}

class SideItem{
    private String type;
    private double price;

    public SideItem(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}

class Main{
    public static void main(String[] args) {
        Meal regularMeal=new Meal();
        Burger burger1=new Burger();
        SideItem sideItem1=new SideItem("Baked Potato",3);
        Drink drink1=new Drink("Fanta","Medium",2);
        Meal meal=new Meal(burger1,sideItem1,drink1);
        System.out.println("You have ordered a "+burger1.getType() +" with a "+ sideItem1.getType()
        + " side and a "+ drink1.getType() + " drink. In total, the cost is: "+ meal.printTotal());
        System.out.println(drink1.getAdjustedPrice("Large"));
        burger1.addExtraTopping1("Lettuce",1.5);
    }
}
