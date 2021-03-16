import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TT {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        List<Character> strings = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        strings.add('a');
        strings.add('A');

        integers.add((int)strings.get(0));
        integers.add((int)strings.get(1));

        Collections.sort(strings);
        Collections.sort(integers);
        System.out.println(strings);
        System.out.println(integers);
    }
}
