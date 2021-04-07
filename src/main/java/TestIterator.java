import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }

//        for (Integer i : list){
//            if(i.equals(2*2)){
//                list.remove(i);
//            }
//        }
//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()){
//            Integer i = iterator.next();
//            if(i.equals(4)){
//                iterator.remove();
//            }
//        }

        list.removeIf(i -> i.equals(4));

        System.out.println(list);
    }
}
