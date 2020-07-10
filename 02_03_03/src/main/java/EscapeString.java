import org.apache.commons.text.StringEscapeUtils;

/**
 * 采用Apache Commons Text 完成字符转义
 *
 * @author 25852
 */
public class EscapeString {
    public static void main(String[] args) {
        String str = "He didn't say, \"Stop!\"";
        //转义
        String escapedStr = StringEscapeUtils.escapeJava(str);
        System.out.println("escape" + ":" + escapedStr);
        //从转义字符串转回来
        String str2 = StringEscapeUtils.unescapeJava(escapedStr);
        System.out.println("unescape" + ":" + str2);
    }
}
