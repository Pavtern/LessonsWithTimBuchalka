package ArrayColl.Phone;

import java.awt.*;
import java.util.Scanner;
import java.util.SplittableRandom;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0095 452 55 54");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while (!quit){
            System.out.println("\nEnter action: (0, to show available actions)");
            int action = scan.nextInt();
            scan.nextLine();

            switch (action){
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                default:
                    printActions();
                    break;
            }
        }


    }

    private static void addNewContact(){
        System.out.println("Enter new contact name:");
        String name = scan.nextLine();
        System.out.println("Enter a phone number: ");
        String phoneNumber = scan.nextLine();
        Contact contact = Contact.createContact(name, phoneNumber);
        if(mobilePhone.addNewContact(contact)){
            System.out.println("Contact created: name = " + name + " phone number = " + phoneNumber);
        }else {
            System.out.println("Cannot add " + name + " has already on file.");
        }

    }

    private static void updateContact(){
        System.out.println("Enter old contact name:");
        String oldName = scan.nextLine();
        if(mobilePhone.findContact(oldName) < -1){
            System.out.println("Enter new contact name:");
            String newName = scan.nextLine();
            System.out.println("Enter a phone number: ");
            String phoneNumber = scan.nextLine();
            Contact newContact = Contact.createContact()
            mobilePhone.updateContact()
        }
    }

    private static void startPhone(){
        System.out.println("Starting a phone...");
    }

    private static void printActions(){
        System.out.println("\n Press: ");
        System.out.println("\t 1 - to print a phone book");
        System.out.println("\t 2 - to add a contact");
        System.out.println("\t 3 - to modify a contact");
        System.out.println("\t 4 - to remove a contact");
        System.out.println("\t 5 - to search a contact");
        System.out.println("\t 6 - to quit the app");
        System.out.println("Choose your action: ");
    }
}

