class Person {
    int id;
    String name;
}

public class ExceptionDemo {
    public static void main(String[] args) {
        int n = 5 / 0;  //ArithmeticException
        int[] a = new int[3];
        System.out.println(a[3]);  //ArrayIndexOutOfBoundsException
        Person p1 = new Person();
        System.out.println(p1.id);
        System.out.println(p1.name.length());  //NullPointerException
    }
}
