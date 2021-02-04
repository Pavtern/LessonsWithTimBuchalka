package ArrayColl.BankHM;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

public class Bank {
    private String name;
    private List<Branch> branches;


    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double amount) {
        Branch findingBranch = findBranch(branchName);
        if (findingBranch != null) {
            return findingBranch.newCustomer(customerName, amount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch findingBranch = findBranch(branchName);
        if (findingBranch != null) {
            return findingBranch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for (Branch branch : branches) {
            if (branch.getName().equals(branchName)) {
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customers details for branch " + branch.getName());
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            int i = 1;
            for (Customer customer : branchCustomers) {
                System.out.println("Customer " + "#" + i++ + ": " + customer.getName());
                if (showTransaction) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = customer.getTransactions();
                    int j = 1;
                    for (double transaction : transactions) {
                        System.out.println("#" + (j++) + ": " + transaction + "$");
                    }
                }
            }
            return true;
        }
        return false;
    }

}
