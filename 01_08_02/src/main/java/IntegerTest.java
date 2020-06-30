public class IntegerTest {
    public static void main(String[] args) {
        short a1 = 32767;
        System.out.println(a1);
        //short a2 = 32768;  error 越界
        int b1 = 2147483647;
        System.out.println(b1);
        //int b2 = 2147483648; error 越界
        long c1 = 1000000000000L;
        System.out.println(c1);
        long c2 = 2147483647;  //隐式做了从int变成long的操作
        System.out.println(c2);
        long c3 = 2147483648L; //去掉L将报错
        System.out.println(c3);
    }
}
