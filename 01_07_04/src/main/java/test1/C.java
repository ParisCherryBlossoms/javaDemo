package test1;

//C is a subclass of A, and in the same package of A.
public class C extends A {
    public void show() {
        //System.out.println(v1);  error, private
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);
        //showV1();  error, private
        showV2();
        showV3();
        showV4();
        A obj = new A();
        //System.out.println(obj.v1);   error,  private
        System.out.println(obj.v2);
        System.out.println(obj.v3);
        System.out.println(obj.v4);
        //obj.showV1();   error,  private
        obj.showV2();
        obj.showV3();
        obj.showV4();
    }
}
