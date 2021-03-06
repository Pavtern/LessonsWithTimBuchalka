package Interfaces.Chalange;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> go = readValues();
        Player player = new Player("my", 12, 2);
        saveObject(player);
        ISaveable monster = new Monster("Gereen", 12,34);
        System.out.println(((Monster) monster).getStrength());
    }

    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit){
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String str = scanner.nextLine();
                    values.add(index, str);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave){
        for (String element : objectToSave.write()){
            System.out.println("Saving " + element + " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values = new ArrayList<>();
        objectToLoad.read(values);
    }
}
