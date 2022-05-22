import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        Integer[] scores = new Integer[] {80, 66, 73, 92, 43};
        Stream<Integer> scoresStream = Arrays.stream(scores);

        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("coffee");
        shoppingList.add("bread");
        shoppingList.add("pineapple");
        shoppingList.add("milk");
        shoppingList.add("pasta");

        Stream<String> shoppingListStream = shoppingList.stream();

        Stream<String> letterStream = Stream.of("a", "b", "c");


        shoppingListStream.sorted()
                .map(item -> item.toUpperCase())
                .filter(item -> item.startsWith("P"))
                .forEach(p -> System.out.println(p));


        List<String> sortedList = shoppingList.stream()
                .sorted()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(sortedList);
    }
}
