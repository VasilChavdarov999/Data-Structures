import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class WarGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> firstSet = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toCollection(LinkedHashSet::new));
        Set<Integer> secondSet = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toCollection(LinkedHashSet::new));
        int rounds = 0;

        while (!firstSet.isEmpty() && !secondSet.isEmpty()){
            rounds++;
            if (rounds == 50){
                break;
            }
            Iterator<Integer> firstIterator = firstSet.iterator();
            int firstCard = firstIterator.next();
            firstIterator.remove();

            Iterator<Integer> secondIterator = secondSet.iterator();
            int secondCard = secondIterator.next();
            secondIterator.remove();
            if (firstCard > secondCard){
                firstSet.add(firstCard);
                firstSet.add(secondCard);
            }else if (secondCard > firstCard){
                secondSet.add(firstCard);
                secondSet.add(secondCard);
            }
        }
        if (firstSet.size() > secondSet.size()){
            System.out.println("First player win!");
        }else if (secondSet.size() > firstSet.size()){
            System.out.println("Second player win!");
        }else {
            System.out.println("Draw!");
        }

    }
}
