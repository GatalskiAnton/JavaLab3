public class Task1 {
    public static String RemovLeadingZeros(String str) {
        return str.replaceAll("0+\\.", "0.").replaceAll("\\s+", " ");
    }
}
