public class Main {
    public static void main(String[] args) {
        SolarSystem solarSystem = SolarSystem.getInstance();

        System.out.println("The central star of the solar system is: " + solarSystem.getSun());

        // Accéder à la liste des planètes
        for (Planet planet : solarSystem.getPlanets()) {
            System.out.println("Planet: " + planet.getName());
        }
    }
}
