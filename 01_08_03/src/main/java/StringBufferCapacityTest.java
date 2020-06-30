public class StringBufferCapacityTest {
    public static void main(String[] args) {
        //StringBuffer的的初始大小为（16+初始字符串长度）即capacity=16+初始字符串长度
        //length 实际长度  capacity 存储空间大小
        StringBuffer sb1 = new StringBuffer();
        System.out.println("sb1 length: " + sb1.length());
        System.out.println("sb1 capacity: " + sb1.capacity());
        System.out.println("=====================");
        StringBuffer sb2 = new StringBuffer("123");
        sb2.append("456");
        System.out.println("sb2 length: " + sb2.length());
        System.out.println("sb2 capacity: " + sb2.capacity());
        System.out.println("=====================");
        sb2.append("7890123456789");
        System.out.println("sb2 length: " + sb2.length());
        System.out.println("sb2 capacity: " + sb2.capacity());
        System.out.println("=====================");
        sb2.append("0");
        System.out.println("sb2 length: " + sb2.length());
        System.out.println("sb2 capacity: " + sb2.capacity());
        //一旦length大于capacity时，capacity便在前一次的基础上加1后翻倍；
        System.out.println("=====================");
        //当前sb2length 20   capacity 40， 再append 70个字符 超过(加1再2倍数额)
        sb2.append("1234567890123456789012345678901234567890123456789012345678901234567890");
        System.out.println("sb2 length: " + sb2.length());
        System.out.println("sb2 capacity: " + sb2.capacity());
        //如果append的对象很长，超过(加1再2倍数额)，将以最新的长度更换
        System.out.println("=====================");
        sb2.append("0");
        System.out.println("sb2 length: " + sb2.length());
        System.out.println("sb2 capacity: " + sb2.capacity());
        sb2.trimToSize();
        System.out.println("=====after trime================");
        System.out.println("sb2 length: " + sb2.length());
        System.out.println("sb2 capacity: " + sb2.capacity());
    }
}
