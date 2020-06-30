import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal("123456789.987654321"); // 声明BigDecimal对象
        BigDecimal b2 = new BigDecimal("987654321.123456789"); // 声明BigDecimal对象
        System.out.println("b1: " + b1 + ", b2:" + b2);
        System.out.println("加法操作：" + b2.add(b1)); // 加法操作
        System.out.println("减法操作：" + b2.subtract(b1)); // 减法操作
        System.out.println("乘法操作：" + b2.multiply(b1)); // 乘法操作
        //需要指定位数，防止无限循环，或者包含在try-catch中
        System.out.println("除法操作：" + b2.divide(b1, 10, BigDecimal.ROUND_HALF_UP)); // 除法操作
        System.out.println("最大数：" + b2.max(b1)); // 求出最大数
        System.out.println("最小数：" + b2.min(b1)); // 求出最小数
        int flag = b1.compareTo(b2);
        if (flag == -1)
            System.out.println("比较操作: b1<b2");
        else if (flag == 0)
            System.out.println("比较操作: b1==b2");
        else
            System.out.println("比较操作: b1>b2");
        System.out.println("===================");
        //尽量采用字符串赋值
        System.out.println(new BigDecimal("2.3"));
        System.out.println(new BigDecimal(2.3));
        System.out.println("===================");
        BigDecimal num1 = new BigDecimal("10");
        BigDecimal num2 = new BigDecimal("3");
        //需要指定位数，防止无限循环，或者包含在try-catch中
        BigDecimal num3 = num1.divide(num2, 3, BigDecimal.ROUND_HALF_UP);
        System.out.println(num3);
    }
}
