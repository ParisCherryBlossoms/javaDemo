import java.util.Locale;
import java.util.ResourceBundle;

public class NewHelloWorld {
    public static void main(String[] args) {
        // 取得系统默认的国家/语言环境
        Locale myLocale = Locale.getDefault();
        System.out.println(myLocale); //zh_CN
        // 根据指定语言_国家环境加载资源文件
        ResourceBundle bundle = ResourceBundle.getBundle("message", myLocale);
        // 从资源文件中取得的消息
        System.out.println(bundle.getString("hello"));  //你好, 世界
        myLocale = new Locale("en", "US"); //语言 国家, 强制换成en_US
        bundle = ResourceBundle.getBundle("message", myLocale);
        System.out.println(bundle.getString("hello"));  //Hello World
    }
}
