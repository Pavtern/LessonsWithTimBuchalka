package Withdrow;

public class Main {
    public static void main(String[] args) {
        Account bobsAccount = new Account("105070403059", "Bob Dealen", "bob@gmail.com", "0077858585", 100);
        Account grishaAccount = new Account();
        bobsAccount.deposit(100);
        bobsAccount.getBalance();
        bobsAccount.withdrawal(50);
        bobsAccount.withdrawal(51);
        bobsAccount.withdrawal(51);
        bobsAccount.withdrawal(51);
        System.out.println(grishaAccount.getBalance());
        System.out.println(grishaAccount.getCustomerEmailAddress());
        System.out.println(grishaAccount.getCustomerName());
    }
}
