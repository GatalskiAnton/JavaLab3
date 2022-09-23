import java.util.Arrays;
import java.util.stream.Collectors;

public class Task1 {
    public static String RemoveLeadingZeros(String str) {
        return Arrays.asList(str.split("\\s+")).stream().map(num -> num.replaceAll("0+(.+)\\.|\\s+", "$1.")).collect(Collectors.joining(" "));
    }
}
