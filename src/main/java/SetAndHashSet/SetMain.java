package SetAndHashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i = 1; i < 100; i++) {
            squares.add(i*i);
            cubes.add(i*i*i);
        }

        Set<Integer> unions = new HashSet<>(squares);
        unions.addAll(cubes);

        Set<Integer> intersections = new HashSet<>(squares);
        intersections.retainAll(cubes);
        for(int i : intersections)
            System.out.println(i + " is the square of " + Math.sqrt(i) + " and the cube of " + Math.cbrt(i));

        Set<String> words = new HashSet<>();
        String sentence = "one day in the yer of the fox";
        String[] arrayWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));

        System.out.println(words);
    }

}
