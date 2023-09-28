
public class Planet {
    private static Planet instance;
    private String name;

    public Planet(String name) {
        this.name = name;
    }

    public static Planet getInstance(String name) {
        if (instance == null) {
            instance = new Planet(name);
        }
        return instance;
    }

    public String getName() {
        return name;
    }
}
