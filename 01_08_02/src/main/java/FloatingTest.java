public class FloatingTest {
    public static void main(String[] args) {
        float f1 = 1.23f;
        // float f2 = 1.23;  error, float赋值必须带f
        double d1 = 4.56d;
        double d2 = 4.56;  //double 可以省略末尾d
        System.out.println(f1);
        System.out.println((double) f1); //转换到double
        System.out.println(d1);
        System.out.println((float) d2);
        System.out.println(f1 == 1.229999999f); //true
        System.out.println(f1 - 1.229999999f); //0.0
        System.out.println(d2 == 4.559999999999999999d); //true
        System.out.println(d2 - 4.559999999999999999d); //0.0
    }
}
