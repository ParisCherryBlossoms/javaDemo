public class StringBufferReferenceTest {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("123");
        StringBuffer sb2 = sb1;
        sb1.append("12345678901234567890123456789012345678901234567890");
        System.out.println(sb2);  //sb1 和 sb2还是指向同一个内存的
    }
}
