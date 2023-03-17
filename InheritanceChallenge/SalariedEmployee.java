package InheritanceChallenge;

public class SalariedEmployee extends Employee{
    private double annualSalary;
    boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String endDate, long employeeId,
                            String hireDate, double annualSalary, boolean isRetired){
        super(name, birthDate, endDate, employeeId, hireDate);
        this.annualSalary=annualSalary;
        this.isRetired=isRetired;
    }

    public void retire(String endDate) {
        terminate(endDate);
        System.out.println("Employee has retired");
    }
}
