package D.E;
//一般来说，包名都是纯小写的。这里大写仅仅和类名统一

import A.B.C;

public class F {

    public static void main(String[] args) {
        System.out.println("I can call C for cooking");
        new C().cook();
    }

    public void cook() {
        System.out.println("I can call C");
        new C().cook();
    }
}
