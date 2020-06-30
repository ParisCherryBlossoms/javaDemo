package test2;

import test1.A;

public class D extends A{
    public void show()
    {
        //System.out.println(v1);  error, private
        //System.out.println(v2);  error, default
        System.out.println(v3);
        System.out.println(v4);
        //showV1();  error, private
        //showV2();  error, default
        showV3();
        showV4();
        A obj = new A();
        //System.out.println(obj.v1);   error,  private
        //System.out.println(obj.v2);   error,  default
        //System.out.println(obj.v3);   error,  protected 只能作为子类才能访问
        System.out.println(obj.v4);
        //obj.showV1();   error,  private
        //obj.showV2();   error,  default
        //obj.showV3();   error   protected 只能作为子类才能访问
        obj.showV4();
    }
}
