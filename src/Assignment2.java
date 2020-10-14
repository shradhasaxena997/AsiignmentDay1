import java.util.Arrays;
import java.util.List;

@FunctionalInterface
public interface Assignment2 {
    public abstract void cities();
}

class CitiesInfo {
    public static void main(String[] args) {
        Assignment2 city = () -> {
            List<String> city_names = Arrays.asList("bareilly", "lucknow", "agra", "calvin", "noida", "california", "cabla");
            city_names.stream()
                    .filter(string -> string.startsWith("c"))
                    .sorted()
                    .forEach(System.out::println);
        };
        city.cities();
    }
}