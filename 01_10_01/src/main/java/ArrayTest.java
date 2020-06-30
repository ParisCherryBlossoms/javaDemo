public class ArrayTest {
    public static void main(String[] args) {
        int a[]; //a 还没有new操作  实际上是null，也不知道内存位置
        int[] b; //b 还没有new操作  实际上是null，也不知道内存位置
        int[] c = new int[2]; //c有2个元素，都是0
        c[0] = 10;
        c[1] = 20; //逐个初始化
        int d[] = new int[]{0, 2, 4};//d有3个元素, 0,2,4，同时定义和初始化
        int d1[] = {1, 3, 5};        //d1有3个元素, 1,3,5 同时定义和初始化
        //注意声明变量时候没有分配内存，不需要指定大小，以下是错误示例
        //int e[5];
        //int[5] f;
        //int[5] g = new int[5];
        //int h[5] = new int[5];
        //需要自己控制索引位置
        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i]);
        }
        //无需控制索引位置
        for (int e : d) {
            System.out.println(e);
        }
    }
}
