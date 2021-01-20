package ArrayColl;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your list.");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println("Item #" + (i+1) + " is: " + groceryList.get(i));
        }
    }

    public void modifyGrocery(String item, int place){
        groceryList.set(place, item);
        System.out.println("Grocery item " + place + " has been modified.");
    }

    public void deleteGrocery(int place){
        String theItem = groceryList.get(place);
        groceryList.remove(place);
    }

    public String findItem(String item){
        int itemPlace = groceryList.indexOf(item);
        if(itemPlace > -1) return groceryList.get(itemPlace);
        return null;
    }
}
