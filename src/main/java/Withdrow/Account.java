package Withdrow;

public class Account {
    private String number;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;
    private double balance;

    public Account() {
        this("default", "default", "default", "default", 0 );
    }



    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this("60616", customerName, customerEmailAddress, customerPhoneNumber, 123);
    }

    public Account(String number, String customerName, String customerEmailAddress, String customerPhoneNumber, double balance) {
        this.number = number;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
        this.balance = balance;
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdrawal(double withdrawAmount){
        if(this.balance - withdrawAmount < 0){
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        } else {
            this.balance -= withdrawAmount;
            System.out.println("Withdrawal of " + withdrawAmount + " processed. Remaining balance is " + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
