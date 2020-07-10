import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 采用Apache Commons Lang 来完成字符串和集合转化
 *
 * @author 25852
 */
public class String2List {
    public static void main(String[] args) {
        List<String> names = new LinkedList<String>();
        names.add("Xiaohong");
        names.add("Xiaoming");
        names.add("Daming");
        names.add("Xiaohei");
        //从ArrayList变到字符串
        String str1 = String.join(",", names);  //String.join， JDK 8 引入
        System.out.println(str1);
        String str2 = StringUtils.join(names, ",");  //Apache Commons Lang
        System.out.println(str2);
        //从字符串变回ArrayList
        List<String> names2 = Arrays.asList(str2.split(","));
        for (String name : names2) {
            System.out.println(name);
        }
        //StringUtils 可以支持更多数据类型
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(3);
        ids.add(5);
        String str3 = StringUtils.join(ids, ",");
        System.out.println(str3);
    }
}
