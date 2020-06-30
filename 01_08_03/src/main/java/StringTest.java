public class StringTest {
    public static void main(String[] args) {
        String a = "123;456;789;123 ";
        System.out.println(a.charAt(0)); // 返回第0个元素
        System.out.println(a.indexOf(";")); // 返回第一个;的位置
        System.out.println(a.concat(";000")); // 连接一个新字符串并返回，a不变
        System.out.println(a.contains("000")); // 判断a是否包含000
        System.out.println(a.endsWith("000")); // 判断a是否以000结尾
        System.out.println(a.equals("000")); // 判断是否等于000
        System.out.println(a.equalsIgnoreCase("000"));// 判断在忽略大小写情况下是否等于000
        System.out.println(a.length()); // 返回a长度
        System.out.println(a.trim()); // 返回a去除前后空格后的字符串，a不变
        String[] b = a.split(";"); // 将a字符串按照;分割成数组
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        System.out.println("===================");
        System.out.println(a.substring(2, 5)); // 截取a的第2个到第5个字符 a不变
        System.out.println(a.replace("1", "a"));
        System.out.println(a.replaceAll("1", "a")); // replaceAll第一个参数是正则表达式
        System.out.println("===================");
        String s1 = "12345?6789";
        String s2 = s1.replace("?", "a");
        String s3 = s1.replaceAll("[?]", "a");
        // 这里的[?] 才表示字符问号，这样才能正常替换。不然在正则中会有特殊的意义就会报异常
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s1.replaceAll("[\\d]", "a")); //将s1内所有数字替换为a并输出，s1的值未改变。
    }
}
