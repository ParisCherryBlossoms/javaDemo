import java.util.Locale;
import java.util.ResourceBundle;

public class NameTest {
    public static void main(String[] args) {
        Locale myLocale = Locale.getDefault();
        System.out.println(myLocale); //zh_CN
        // 根据指定语言_国家环境加载资源文件
        ResourceBundle bundle = ResourceBundle.getBundle("msg", myLocale);
        // 从资源文件中取得的消息
        System.out.println(bundle.getString("name"));  //陈良育
    }
}
