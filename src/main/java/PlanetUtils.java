import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PlanetUtils {

    public List<Planet> getPlanetsBeginningWithM(List<Planet> planets) {
        Function<List<Planet>, List<Planet>> planetsBeginWithM = (List<Planet> planetList) -> planetList.stream()
                .filter(item -> item.getName().startsWith("M"))
                .collect(Collectors.toList());
        return planetsBeginWithM.apply(planets);
    }

    public List<Planet> getPlanetsWithRings(List<Planet> planets) {
        return planets.stream()
                .filter(Planet::isHasRings)
                .collect(Collectors.toList());
    }

    public List<Planet> getPlanetsWithMoreThanThreeMoons(List<Planet> planets) {
        return planets.stream()
                .filter(planet -> planet.getNumberOfMoons() > 3)
                .collect(Collectors.toList());
    }

    public List<Planet> getPlanetsWithDensityMoreThanFive(List<Planet> planets) {
        return planets.stream()
                .filter(planet -> planet.getDensity() > 5)
                .collect(Collectors.toList());
    }
}
