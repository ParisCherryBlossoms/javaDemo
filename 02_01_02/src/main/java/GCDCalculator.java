public class GCDCalculator {
    public static int gcd(int m, int n) {
        int r = 1;
        while (r != 0) {
            r = m % n;
            m = n;
            n = r;
        }
        r = m;
        return r;
    }

    public static void main(String[] args) {
        System.out.println(gcd(20, 10 ));
    }
}
