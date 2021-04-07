package SetAndHashSet.Challenge;

public class Satellite extends HeavenlyBody {
    private final String hostPlanetName;

    public Satellite(String name, double orbitalPeriod, String bodyType, String hostPlanetName) {
        super(name, orbitalPeriod, bodyType);
        this.hostPlanetName = hostPlanetName;
    }
}
