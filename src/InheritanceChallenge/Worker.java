package InheritanceChallenge;

public class Worker {
    private String name;
    private String birthDate;
    protected String endDate;

    public Worker(String name, String birthDate, String endDate){
        this.name=name;
        this.birthDate=birthDate;
        this.endDate=endDate;
    }

    public int getAge(){
        int currentYear=2023;
        int birthYear=Integer.parseInt(birthDate);
        return currentYear-birthYear;
    }

    public double collectPay(double pay){
        return pay;
    }

    public void terminate(String endDate){
        this.endDate=endDate;
        System.out.println("Employment is terminated from: " + endDate);
    }
}
