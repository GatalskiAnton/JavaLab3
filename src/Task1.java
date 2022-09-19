public class Task1 {
    public static String RemoveLeadingZeros(String str) {
        return str.replaceAll("0+([1-9]+)\\.", "$1.").replaceAll("\\s+", " ");
    }
}
