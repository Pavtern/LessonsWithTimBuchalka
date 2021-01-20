package ArrayColl;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    search();
                    break;
                case 6:
                    quit = true;
                    break;
                default:
                    printInstructions();

            }
        }
    }


    public static void printInstructions() {
        System.out.println("\n Press: ");
        System.out.println("\t 1 - to print a list");
        System.out.println("\t 2 - to add an item");
        System.out.println("\t 3 - to modify an item");
        System.out.println("\t 4 - to remove an item");
        System.out.println("\t 5 - to search an item");
        System.out.println("\t 6 - to quit the app");
    }


    public static void addItem() {
        System.out.println("Enter your new string:");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.println("Enter a # of item:");
        int place = scanner.nextInt() - 1;
        scanner.nextLine();
        System.out.println("Enter a modified string:");
        String modifiedString = scanner.nextLine();
        groceryList.modifyGrocery(modifiedString, place);
    }

    public static void removeItem() {
        System.out.println("Enter a # of item:");
        groceryList.deleteGrocery(scanner.nextInt()-1);
        scanner.nextLine();
    }

    public static void search() {
        System.out.println("Enter a string which you search:");
        System.out.println(groceryList.findItem(scanner.nextLine()));
    }
}
