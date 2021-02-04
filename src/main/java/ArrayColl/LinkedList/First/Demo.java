package ArrayColl.LinkedList.First;

import java.net.Socket;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Havai");
        placesToVisit.add("Elbrus");
        placesToVisit.add("Black sea");
        placesToVisit.add("Russia");
        placesToVisit.add("German");
        placesToVisit.add("Italy");
        placesToVisit.add("Spain");

        addInOrder(placesToVisit, "Ferrero");
        addInOrder(placesToVisit,"Ximon");
        addInOrder(placesToVisit,"Havai");
        addInOrder(placesToVisit,"Anapa");
        printList(placesToVisit);
    }



    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()){
            System.out.println("Now visiting: " + i.next());
        }
        System.out.println("+++++++++++++++++++++++++++++++++++");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String str){
        ListIterator<String> listIterator = linkedList.listIterator();

        while (listIterator.hasNext()){
            int comparison = listIterator.next().compareTo(str);
            if(comparison == 0){
                System.out.println(str + "is already included as a destination.");
                return false;
            }else if (comparison > 0){
                listIterator.previous();
                listIterator.add(str);
                return true;
            }
        }
        listIterator.add(str);
        return true;
    }
}


