package SetAndHashSet.Challenge;

import java.util.HashSet;
import java.util.Set;

abstract class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final String bodyType;

    public HeavenlyBody(String name, double orbitalPeriod, String bodyType) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.bodyType = bodyType;
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
        // // TODO: ask Nik about todo
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || obj.getClass() != this.getClass()) return false;

        String objName = ((HeavenlyBody) obj).getName();
        return this.getName().equals(objName);
    }

}
