package SetAndHashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody tempHeavenly = new HeavenlyBody("Mercury", 88);
        planets.add(tempHeavenly);
        solarSystem.put(tempHeavenly.getName(), tempHeavenly);

        tempHeavenly = new HeavenlyBody("Venus",225);
        planets.add(tempHeavenly);
        solarSystem.put(tempHeavenly.getName(), tempHeavenly);

        tempHeavenly = new HeavenlyBody("Earth",365);
        planets.add(tempHeavenly);
        solarSystem.put(tempHeavenly.getName(), tempHeavenly);

        HeavenlyBody earth = new HeavenlyBody("Earth",563);
        planets.add(earth);

        HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        tempHeavenly.addMoon(tempMoon);


        for(HeavenlyBody planet : planets){
            System.out.println(planet.getName());
        }

        String str = "Earth";
        System.out.println(earth.equals(str));
    }
}
