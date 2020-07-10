package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchesLooking {
    private static final String REGEX = "foo";
    private static final String INPUT = "foo";
    private static Pattern pattern;
    private static Matcher matcher;

    public static void main(String[] args) {
        // Initialize
        pattern = Pattern.compile(REGEX);
        matcher = pattern.matcher(INPUT);
        System.out.println("Current REGEX is: " + REGEX);
        System.out.println("Current INPUT is: " + INPUT);
        System.out.println("lookingAt(): " + matcher.lookingAt()); //部分匹配
        System.out.println("matches(): " + matcher.matches()); //完全匹配
    }
}
