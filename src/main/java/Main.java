import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    final static String text = "Behavior is the mirror in which everyone shows their image";

    public static void main(String[] args) {

        String[] str = text.split(" ");

        for (String word:dictionary(str)) {
            System.out.println(word);
        }
    }

    public static List<String> dictionary(String[] str) {
        return Arrays.stream(str)
                .sorted()
                .collect(Collectors.toList());
    }
}
