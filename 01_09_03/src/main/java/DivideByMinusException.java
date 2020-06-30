public class DivideByMinusException extends Exception {
    int divisor;

    public DivideByMinusException(String msg, int divisor) {
        super(msg);
        this.divisor = divisor;
    }

    public int getDivisor() {
        return this.getDivisor();
    }
}
