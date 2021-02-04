package Interfaces;

public class Main {
    public static void main(String[] args) {
        ITelephone timsPhone;
        timsPhone = new DeskPhone(12345);
        System.out.println(timsPhone.isRinging());
        timsPhone.powerOn();
        timsPhone.callPhone(12345);
        timsPhone.answer();
    }
}
