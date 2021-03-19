package Collections.ArrayList;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> language = new HashMap<>();
        if(language.containsKey("Java")){
            System.out.println("Java is already exists");
        } else {
            language.put("Java", "a compiled high level, object-orientated, platform independent language");
            System.out.println("Java added successfully");
        }
        System.out.println(language.put("Python", "an interpreted, object-orientated, high-level programming language with dynamic semantics"));

        language.remove("Java");
        System.out.println("Python removing is " + (language.remove("Python", "programming language")));


        for (String key : language.keySet()){
            System.out.println(key + " : " + language.get(key));
        }
    }
}
