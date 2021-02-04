package ArrayColl.BankHM;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

       String riscani = "Riscani";
       String center = "Centru";

       Bank bank = new Bank("Banka Nationala");
       bank.addBranch("Riscani");

       bank.addCustomer(riscani, "Tim", 21.09);
       bank.addCustomer(riscani, "Tom", 123.32);
       bank.addCustomer(riscani, "Mike", 32.43);

       bank.addBranch(center);

       bank.addCustomer(center,"Lopas",23.23);
       bank.addCustomer(center,"Foma",23.23);

       bank.addCustomerTransaction(center,"Lopas",23.23);
       bank.addCustomerTransaction(center,"Foma",23.23);
       bank.addCustomerTransaction(riscani, "Mike", 32.43);
       bank.addCustomerTransaction(riscani, "Tom", 123.32);
       bank.addCustomerTransaction(riscani, "Tim", 21.09);

       bank.listCustomers(center, true);
    }
}
