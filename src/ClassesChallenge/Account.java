package ClassesChallenge;

public class Account {
    private int accountNumber;
    private float accountBalance;
    private String customerName;
    private String email;
    private String phoneNo;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public float deposit(float amount){
        return accountBalance+amount;
    }

    public float withdraw(float amount){
        if(amount<=accountBalance)
            return accountBalance-amount;
        else{
            System.out.println("Not enough money");
            return 0;
        }
    }
}
