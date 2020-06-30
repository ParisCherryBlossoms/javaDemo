import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(3);
        ll.add(2);
        ll.add(5);
        ll.add(6);
        ll.add(6);
        System.out.println(ll.size());
        ll.addFirst(9);  //在头部增加9
        ll.add(3, 10);   //将10插入到第四个元素，四以及后续的元素往后挪动
        ll.remove(3);    //将第四个元素删除

        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        traverseByIterator(list);
        traverseByIndex(list);
        traverseByFor(list);

    }

    public static void traverseByIterator(LinkedList<Integer> list) {
        long startTime = System.nanoTime();
        System.out.println("============迭代器遍历==============");
        Iterator<Integer> iter1 = list.iterator();
        while (iter1.hasNext()) {
            iter1.next();
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println(duration + "纳秒");
    }

    public static void traverseByIndex(LinkedList<Integer> list) {
        long startTime = System.nanoTime();
        System.out.println("============随机索引值遍历==============");
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println(duration + "纳秒");
    }

    public static void traverseByFor(LinkedList<Integer> list) {
        long startTime = System.nanoTime();
        System.out.println("============for循环遍历==============");
        for (Integer item : list) {
            ;
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println(duration + "纳秒");
    }
}
