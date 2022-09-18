import java.util.Arrays;
import java.util.stream.Collectors;

public class Task5 {
    public static String firstLetterToUpperCase(String str) {
        return Arrays.asList(str.split(",\\s+|\\.\\s+|,|\\.|\\s+")).stream().map(word -> word.substring(0, 1).toUpperCase() + word.substring(1)).collect(Collectors.joining(" "));
    }
}
