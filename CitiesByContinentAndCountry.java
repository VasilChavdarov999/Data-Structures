
import java.util.*;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Map<String, List<String>>> planet = new LinkedHashMap<>();

        while (n--> 0){
            String[] tokens = scanner.nextLine().split("\\s+");
            String continent = tokens[0];
            String country = tokens[1];
            String town = tokens[2];

            if (!planet.containsKey(continent)){
                planet.put(continent, new LinkedHashMap<>());
                planet.get(continent).put(country, new ArrayList<>());
                planet.get(continent).get(country).add(town);
            }else {
                if (!planet.get(continent).containsKey(country)){
                    planet.get(continent).put(country, new ArrayList<>());
                    planet.get(continent).get(country).add(town);
                }else {
                    planet.get(continent).get(country).add(town);
                }
            }
        }
        for (Map.Entry<String, Map<String, List<String>>> entry : planet.entrySet()) {
            System.out.println(entry.getKey() + ":");
            for (Map.Entry<String, List<String>> innerEntry : entry.getValue().entrySet()){
                System.out.println(" " + innerEntry.getKey() + " -> " +
                        String.join(", ", innerEntry.getValue()));
            }
        }
    }
}
