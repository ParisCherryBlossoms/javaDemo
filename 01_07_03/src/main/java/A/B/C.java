package A.B;
//一般来说，包名都是纯小写的。这里大写仅仅和类名统一

public class C {

    public static void main(String[] args) {
        new C().cook();
    }

    public void cook() {
        System.out.println("C: I can cook very well");
    }
}
