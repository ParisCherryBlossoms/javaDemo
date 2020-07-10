package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    private static String REGEX = "a*b"; //*表示限定前面的a可以有0或者多个。
    private static String INPUT = "aabfooaabfooabfoobcdd";
    private static String REPLACE = "-";

    public static void main(String[] args) {
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT); // get a matcher object
        StringBuffer sb = new StringBuffer();
        //全部替换
        while (m.find()) {
            m.appendReplacement(sb, REPLACE);
        }
        //将最后的尾巴字符串附加上
        m.appendTail(sb);
        System.out.println(sb.toString());
    }
}
