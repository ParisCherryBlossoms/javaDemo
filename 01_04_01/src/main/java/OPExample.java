public class OPExample {
    public static void main(String[] args) {
        int a, b, c;
        a = 1;
        b = 2;
        c = add(a, b);
        System.out.println("c is " + c);
    }

    public static int add(int m, int n)  //函数定义
    {
        return m + n;
    }
}
