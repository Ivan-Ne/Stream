import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // Creating a list with 10000 numbers of int type  from 100 to 200
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 1000; i++){
            numbers.add((int)(Math.random()*100 + 100));
        }

        // Converting the list to stream
        List<String> list = numbers.stream()
                // Filtering the stream, getting numbers that only divide to 2 and 5 without remainder
                .filter((integer) -> integer % 2 == 0 && integer % 5 == 0)
                // Taking the square of a remaining numbers
                .map(Math::sqrt)
                // Converting numbers to String type
                .map((sqrt) -> "Sqrt: " + sqrt)
                // Converting the stream to list
                .collect(Collectors.toList());

        // Checking the result
        for (String s : list){
            System.out.println(s);
        }

        }
    }

