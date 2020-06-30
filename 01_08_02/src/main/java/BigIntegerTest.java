import java.math.BigInteger;

public class BigIntegerTest {

    public static void main(String[] args) {
        BigInteger b1 = new BigInteger("123456789"); // 声明BigInteger对象
        BigInteger b2 = new BigInteger("987654321"); // 声明BigInteger对象
        System.out.println("b1: " + b1 + ", b2:" + b2);
        System.out.println("加法操作：" + b2.add(b1)); // 加法操作
        System.out.println("减法操作：" + b2.subtract(b1)); // 减法操作
        System.out.println("乘法操作：" + b2.multiply(b1)); // 乘法操作
        System.out.println("除法操作：" + b2.divide(b1)); // 除法操作
        System.out.println("最大数：" + b2.max(b1)); // 求出最大数
        System.out.println("最小数：" + b2.min(b1)); // 求出最小数
        BigInteger result[] = b2.divideAndRemainder(b1); // 求出余数的除法操作
        System.out.println("商是：" + result[0] + "；余数是：" + result[1]);
        System.out.println("等价性是：" + b1.equals(b2));
        int flag = b1.compareTo(b2);
        if (flag == -1)
            System.out.println("比较操作: b1<b2");
        else if (flag == 0)
            System.out.println("比较操作: b1==b2");
        else
            System.out.println("比较操作: b1>b2");
    }
}
