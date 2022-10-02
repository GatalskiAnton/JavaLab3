public class Task6 {
    public static String deleteAllNumber(String str)
    {
        return str.replaceAll("\\b\\d+(\\.?)|(\\,?)\\b", "");
    }
}
