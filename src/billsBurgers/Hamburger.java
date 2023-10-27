package billsBurgers;

public class Hamburger {
    public String name;
    public double price;
    public String breadType;
    public String meatType;
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;
    public Hamburger(String name, double price, String breadType, String meatType){
        this.name=name;
        this.price=price;
        this.breadType=breadType;
        this.meatType=meatType;
    }
    public void addAddition1(String name, double price){
        this.addition1Name=name;
        this.addition1Price=price;
    }
    public void addAddition2(String name, double price){
        this.addition2Name=name;
        this.addition2Price=price;
    }
    public void addAddition3(String name, double price){
        this.addition3Name=name;
        this.addition3Price=price;
    }
    public void addAddition4(String name, double price){
        this.addition4Name=name;
        this.addition4Price=price;
    }
    public double itemizeHamburger(){
        double hamburgerPrice=this.price;
        System.out.println("You have selected a " + this.name + " with " + this.breadType + " bread and " + this.meatType + " ,that costs " + this.price );
        if(addition1Name!= null) {
            hamburgerPrice += addition1Price;
            System.out.println("Added " + addition1Name);
        }
        if(addition2Name!= null) {
            hamburgerPrice += addition2Price;
            System.out.println("Added " + addition2Name);
        }
        if(addition3Name!= null) {
            hamburgerPrice += addition3Price;
            System.out.println("Added " + addition3Name);
        }
        if(addition4Name!= null) {
            hamburgerPrice += addition4Price;
            System.out.println("Added " + addition4Name);
        }
        return hamburgerPrice;
    }

}
