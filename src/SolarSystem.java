import java.util.ArrayList;
import java.util.List;

public class SolarSystem {
    private static SolarSystem instance;
    private String sun;
    private List<Planet> planets;

    private SolarSystem() {
        sun = "Sun";
        planets = new ArrayList<>();
        // Ajoutez ici les huit planètes du système solaire
        planets.add(new Planet("Mercury"));
        planets.add(new Planet("Venus"));
        planets.add(new Planet("Earth"));
        planets.add(new Planet("Mars"));
        planets.add(new Planet("Jupiter"));
        planets.add(new Planet("Saturn"));
        planets.add(new Planet("Uranus"));
        planets.add(new Planet("Neptune"));
    }

    public static SolarSystem getInstance() {
        if (instance == null) {
            instance = new SolarSystem();
        }
        return instance;
    }

    public List<Planet> getPlanets() {
        return planets;
    }

    public String getSun() {
        return sun;
    }
}