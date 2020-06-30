public class MultiDimArrayTest {
    public static void main(String[] args) {
        //Java多维数组是按照行存储
        //规则数组
        int a[][] = new int[2][3];
        //不规则数组
        int b[][];
        b = new int[3][];
        b[0] = new int[3];
        b[1] = new int[4];
        b[2] = new int[5];
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = ++k;
            }
        }
        for (int[] items : a) {
            for (int item : items) {
                System.out.print(item + ", ");
            }
            System.out.println();
        }
    }
}
