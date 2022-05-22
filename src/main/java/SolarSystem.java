import java.util.ArrayList;
import java.util.List;

public class SolarSystem {

    public static List<Planet> getPlanets() {
    List<Planet> planets = new ArrayList<>();
    Planet mercury = new Planet("Mercury");
    mercury.setDensity(5.43);
    mercury.setHasRings(false);
    mercury.setNumberOfMoons(0);

    Planet venus = new Planet("Venus");
    venus.setDensity(5.24);
    venus.setHasRings(false);
    venus.setNumberOfMoons(0);

    Planet earth = new Planet("Earth");
    earth.setDensity(5.52);
    earth.setHasRings(false);
    earth.setNumberOfMoons(1);

    Planet mars = new Planet("Mars");
    earth.setDensity(3.940);
    earth.setHasRings(false);
    earth.setNumberOfMoons(2);

    Planet jupiter = new Planet("Jupiter");
    earth.setDensity(1.33);
    earth.setHasRings(true);
    earth.setNumberOfMoons(80);

    Planet saturn = new Planet("Saturn");
    earth.setDensity(0.70);
    earth.setHasRings(true);
    earth.setNumberOfMoons(83);

    Planet uranus = new Planet("Uranus");
    earth.setDensity(1.30);
    earth.setHasRings(true);
    earth.setNumberOfMoons(27);

    Planet neptune = new Planet("Neptune");
    earth.setDensity(1.76);
    earth.setHasRings(true);
    earth.setNumberOfMoons(14);

    planets.add(mercury);
    planets.add(venus);
    planets.add(earth);
    planets.add(mars);
    planets.add(jupiter);
    planets.add(saturn);
    planets.add(uranus);
    planets.add(neptune);

    return planets;
    }
}
