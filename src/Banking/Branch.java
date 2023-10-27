package Banking;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;
    public Branch(String name){
        this.name = name;
        customers = new ArrayList<Customer>();
    }
    public String getName() {
        return this.name;
    }
    public ArrayList<Customer> getCustomers() {
        return customers;
    }
    public boolean newCustomer(String customerName, double initialTransaction){
        if(findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initialTransaction));
            return true;
        }
        return false;
    }
    public boolean addCustomerTransaction(String customerName, double transaction) {
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(transaction);
            return true;
        }
        return false;
    }
    private Customer findCustomer(String customerName){
        for (int i=0; i<this.customers.size(); i++){
            if(this.customers.get(i).getName().equals(customerName))
                return this.customers.get(i);
        }
        return null;
    }
}
