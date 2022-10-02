import java.util.Arrays;
import java.util.stream.Collectors;

public class Task3 {
    public static String deleteAllShorts(String str) {
        return  str.replaceAll("\\b\\w\\b", "").replaceAll("\\s+", " ").replaceAll("(\\A\\s+)|(\\s+\\Z)","");
    }
}
