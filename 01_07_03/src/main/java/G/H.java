package G;
//一般来说，包名都是纯小写的。这里大写仅仅和类名统一

import D.E.F;

public class H {
    public static void main(String[] args) {
        System.out.println("I can call F for cooking");
        new F().cook();
    }

    public void cook() {
        System.out.println("I can call F");
        new F().cook();
    }
}
