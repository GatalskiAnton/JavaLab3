import java.util.Arrays;
import java.util.stream.Collectors;

public class Task3 {
    public static String deleteAllShorts(String str) {
        return Arrays.asList(str.split("\\s+")).stream().filter(word -> word.length() != 1).collect(Collectors.joining(" ")).trim();
    }
}
