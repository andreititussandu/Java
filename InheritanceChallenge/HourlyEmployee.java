package InheritanceChallenge;

public class HourlyEmployee extends Employee {
    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String endDate, long employeeId,
                            String hireDate, double hourlyPayRate){
        super(name, birthDate, endDate, employeeId, hireDate);
        this.hourlyPayRate=hourlyPayRate;
    }

    public double getDoublePay(double pay) {
        return 2*super.collectPay(pay);
    }
}
