import java.io.UnsupportedEncodingException;

public class StringTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String a = "我是中国人";
        String b = new String(a.getBytes("UTF-8"), "GBK");
        System.out.println(b);
        String c = new String(b.getBytes("GBK"), "UTF-8");
        System.out.println(c);
    }
}
