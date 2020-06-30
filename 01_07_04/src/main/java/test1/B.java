package test1;

//B and A are in the same package
public class B {
    public void show() {
        //B is not subclass of A
//		System.out.println(v1);  //error
//		System.out.println(v2);  //error
//		System.out.println(v3);  //error
//		System.out.println(v4);  //error
//		showV1();   //error
//		showV2();   //error
//		showV3();   //error
//		showV4();   //error
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
