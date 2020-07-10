package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) {
        regularExpression();
    }

    public static void regularExpression() {
        String REGEX_EMAIL = "^\\w+((-\\w+)|(\\.\\w+))*@[A-Za-z0-9]+(([.\\-])[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$";//email
        Pattern pattern = Pattern.compile(REGEX_EMAIL);
        String[] emails = new String[]{"123^@qq.com", "name_321@163.com", "+whatever*72@gmail.com"};
        for (String email : emails) {
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                System.out.println(email + " is valid email.");
            } else {
                System.out.println(email + " is not valid email.");
            }
        }
    }
}
