package InheritanceChallenge;

class Main {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee=new SalariedEmployee("Ionel","1978","2022"
        , 234,"Feb 2020",5000,true);
        HourlyEmployee hourlyEmployee =new HourlyEmployee("Ionel","1978","2022",
                234,"Feb 2020",50);
        System.out.println("The employee's age is: " + salariedEmployee.getAge());
        System.out.println(salariedEmployee.collectPay(400));
        salariedEmployee.retire("June 2022");
        System.out.println(hourlyEmployee.getDoublePay(1000));
    }
}
