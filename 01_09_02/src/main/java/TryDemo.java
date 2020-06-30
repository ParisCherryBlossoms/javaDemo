public class TryDemo {
    public static void main(String[] args) {
        try {
            int a = 5 / 2; //无异常
            System.out.println("a is " + a);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("Phrase 1 is over");
        }
        try {
            int a = 5 / 0; //ArithmeticException
            System.out.println("a is " + a);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("Phrase 2 is over");
        }
        try {
            int a = 5 / 0; //ArithmeticException
            System.out.println("a is " + a);
        } catch (Exception ex) {
            ex.printStackTrace();
            int a = 5 / 0; //ArithmeticException
        } finally {
            System.out.println("Phrase 3 is over");
        }
    }
}
