package data_struct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListTest {
    public static void main(String[] args) {
        //长度固定的列表
        List<Integer> fixedLength = Arrays.asList(4,5,1,3,4);
        testList(fixedLength,"定长列表");
        //不可变的列表
        List<Integer> immutable = Collections.unmodifiableList(fixedLength);
        testList(immutable,"不可变列表");
        //可变的列表
        List<Integer> mutable = new ArrayList<>(fixedLength);
        testList(mutable,"可变列表");
        // java9中的新写法，不可变的列表
        // List<Integer> immutable = List.of(4,5,1,3);

        testDistinct(immutable);
    }

    /**
     * 本函数会改变传入数组的值
     * @param a
     */
    public static void testList(List<Integer> a, String title) {
        System.out.println("+"+title+"：");
        int a2 = a.get(2);
        System.out.println(a2);
        try {
            a.set(2,6);
            System.out.println(a);
        } catch (UnsupportedOperationException e) {
            System.out.println("不允许修改数值");
        }
        try {
            a.add(2,7);
            System.out.println(a);
        } catch (UnsupportedOperationException e) {
            System.out.println("不允许新建条目");
        }
    }

    public static void testDistinct(List<Integer> a) {
        System.out.println("+数组去重；");
        Set<Integer> b = new HashSet<>(a);
        System.out.println(b);
    }
}
