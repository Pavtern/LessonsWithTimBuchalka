package ArrayColl.Phone;

import java.util.ArrayList;
import java.util.Collection;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts = new ArrayList<>();

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName()) >= 0){
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public void printContacts(){
        System.out.println("Contact list:");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println("Contact name: " + myContacts.get(i).getName() +
                    " phone number " + myContacts.get(i).getPhoneNumber());
        }
    }

    public boolean updateContact(int position, Contact newContact){
        myContacts.set(position, newContact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0) {
            System.out.println("Contact doesn't exist.");
            return false;
        }
        myContacts.set(foundPosition, newContact);
        return true;
    }

    public boolean removeContact(Contact contact){
        int foundPosition = findContact(contact);
        if(foundPosition < 0) {
            System.out.println("Contact doesn't exist.");
            return false;
        }
        myContacts.remove(foundPosition);
        System.out.println(contact.getName() + " was deleted.");
        return true;
    }

    public boolean removeContact(int position){
        if(position < 0) {
            System.out.println("Contact doesn't exist.");
            return false;
        }
        System.out.println(myContacts.get(position).getName() + " was deleted.");
        myContacts.remove(position);
        return true;
    }

    private int findContact(Contact contact){
        return myContacts.indexOf(contact);
    }

    public int findContact(String contactName){
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact contact){
        if(findContact(contact)>=0){
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String contactName){
        if(findContact(contactName)>=0){
            return myContacts.get(findContact(contactName));
        }
        return null;
    }

}
