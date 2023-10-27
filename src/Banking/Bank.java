package Banking;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;
    public Bank(String name){
        this.name=name;
        this.branches=new ArrayList<Branch>();
    }
    public boolean addBranch(String branchName){
        if(findBranch(branches.getName())>=0) {
            System.out.println("Contact is already on file");
            return false;
        }
        branches.add(branchName);
        return true;
    }
    public boolean addCustomer(String branchName, String customerName, double transaction){

    }
    public boolean addCustomerTransaction(String branchName, String customerName, double transaction){

    }
    public int findBranch(String branchName){
        for (int i=0; i<this.branches.size(); i++){
            if(branches.get(i).getName().equals(branchName))
                return i;
        }
        return -1;
    }
    public boolean listCustomers(String branchName, boolean printTransactions){

    }
}
