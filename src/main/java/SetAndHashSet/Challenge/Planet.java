package SetAndHashSet.Challenge;

import java.util.HashSet;
import java.util.Set;

public class Planet extends HeavenlyBody {
    private final Set<Satellite> satellites;

    public Planet(String name, double orbitalPeriod, String bodyType) {
        super(name, orbitalPeriod, bodyType);
        satellites = new HashSet<>();
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(satellites);
    }

    public boolean addMoon(Satellite moon) {
        return satellites.add(moon);
    }

}
