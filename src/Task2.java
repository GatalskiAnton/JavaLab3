import java.util.Arrays;
import java.util.StringTokenizer;

public class Task2 {
    public static double calculateExpression(String expression, double x)  throws NullPointerException
    {
        expression = expression.replaceAll("x", Double.toString(x)).replaceAll("\\s+", "");
        StringTokenizer arr = new StringTokenizer("0" + expression, "+-", true);

        double result = Double.parseDouble(arr.nextToken());

        while (arr.hasMoreTokens())
        {
            String sign = arr.nextToken();
            switch (sign)
            {
                case "+":
                    result += Double.parseDouble(arr.nextToken());
                    break;
                case "-":
                    result -= Double.parseDouble(arr.nextToken());
                    break;
            }
        }
        return result;
    }
}
