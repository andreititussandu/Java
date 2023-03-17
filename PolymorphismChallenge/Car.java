package PolymorphismChallenge;

public class Car {
    private String description;

    public Car(String description){
        this.description=description;
    }


    public void startEngine(){
        System.out.println("Car engine is starting");
    }
    public void drive(){
        System.out.println("Car is in drive mode");
    }
    protected void runEngine(){
        System.out.println("Engine is running");
    }
}

class GasPoweredCar extends Car{
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders){
        super(description);
        this.avgKmPerLitre=avgKmPerLitre;
        this.cylinders=cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("Gas engine is starting");
    }

    @Override
    public void drive() {
        System.out.println("Gas engine car is being driven");
        runEngine();
    }
}

class ElectricCar extends Car {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize){
        super(description);
        this.avgKmPerCharge=avgKmPerCharge;
        this.batterySize=batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println("Battery is starting");
    }

    @Override
    public void drive() {
        System.out.println("Electric car is being driven");
        runEngine();
    }
}

class Main {
    public static void main(String[] args) {
        Car gasPoweredCar=new GasPoweredCar("Dacia", 30,4);
        gasPoweredCar.startEngine();
        gasPoweredCar.drive();

        Car electricCar=new ElectricCar("Tesla",100,8);
        electricCar.startEngine();
        electricCar.drive();

        Object unknownCar=getCar("Dacia");
        if(unknownCar instanceof GasPoweredCar)
            ((GasPoweredCar) unknownCar).startEngine();
        else
            ((Car) unknownCar).startEngine();

    }
    public static Car getCar(String description){
        Car car=new Car(description);
        return car;
    }
}
