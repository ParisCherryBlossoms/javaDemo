import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {
        // 返回Java所支持的全部国家和语言的数组
        Locale[] localeList = Locale.getAvailableLocales();
        for (Locale locale : localeList) {
            System.out.println(locale.getLanguage() + "_" + locale.getCountry());
            System.out.println(locale.getDisplayLanguage() + "_" + locale.getDisplayCountry());
        }
        System.out.println("=========================");
        Locale myLocale = Locale.getDefault();
        System.out.println(myLocale); //zh_CN
        System.out.println(Locale.CHINA); //zh_CN
        myLocale = new Locale("en", "US"); //语言 国家, 强制换成en_US
        System.out.println(myLocale); //en_US
    }
}
