import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class TxtWriteUTF8 {
    public static void main(String[] args) {
        writeFile1();
        System.out.println("===================");
        //writeFile2(); // JDK 7及以上才可以使用
    }

    public static void writeFile1() {
        FileOutputStream fos = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        String charset = "UTF-8";
        try {
            fos = new FileOutputStream("c:/temp/abc.txt"); // 节点类
            osw = new OutputStreamWriter(fos, charset); // 转化类
            //osw = new OutputStreamWriter(fos); // 转化类 采用操作系统默认编码
            bw = new BufferedWriter(osw); // 装饰类
            // br = new BufferedWriter(new OutputStreamWriter(new
            // FileOutputStream("c:/temp/abc.txt")))
            bw.write("我们是");
            bw.newLine();
            bw.write("Ecnuers.^^");
            bw.newLine();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                bw.close(); // 关闭最后一个类，会将所有的底层流都关闭
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void writeFile2() {
        //try-resource 语句，自动关闭资源
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("c:/temp/abc.txt")))) {
            bw.write("我们是");
            bw.newLine();
            bw.write("Ecnuers.^^");
            bw.newLine();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
