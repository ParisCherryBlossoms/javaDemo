package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceDemo2 {
    private static String REGEX = "a*b"; //*表示限定前面的a可以有0或者多个。
    private static String INPUT = "aabfooaabfooabfoob";
    private static String REPLACE = "-";

    public static void main(String[] args) {
        Pattern p = Pattern.compile(REGEX);
        // get a matcher object
        Matcher m = p.matcher(INPUT);
        INPUT = m.replaceAll(REPLACE);
        System.out.println(INPUT);
    }
}
