package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceDemo {
    private static String REGEX = "dog";
    private static String INPUT = "The dog says meow. All dogs say meow.";
    private static String REPLACE = "cat";

    public static void main(String[] args) {
        Pattern p = Pattern.compile(REGEX);
        // get a matcher object
        Matcher m = p.matcher(INPUT);
        INPUT = m.replaceAll(REPLACE);  //把所有的dog都换成cat
        System.out.println(INPUT);
    }
}
