package 测试;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by xieli on 2020/9/29.
 */
public class Collections工具类 {

    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<Integer>();
//        arrayList.add(-1);
//        arrayList.add(3);
//        arrayList.add(3);
//        arrayList.add(-5);
//        arrayList.add(7);
//        arrayList.add(4);
//        arrayList.add(-9);
//        arrayList.add(-7);
//        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
//        arrayList2.add(-3);
//        arrayList2.add(-5);
//        arrayList2.add(7);
//        System.out.println("原始数组:");
//        System.out.println(arrayList);
//
//        System.out.println("Collections.max(arrayList):");
//        System.out.println(Collections.max(arrayList));
//
//        System.out.println("Collections.min(arrayList):");
//        System.out.println(Collections.min(arrayList));
//
//        System.out.println("Collections.replaceAll(arrayList, 3, -3):");
//        Collections.replaceAll(arrayList, 3, -3);
//        System.out.println(arrayList);
//
//        System.out.println("Collections.frequency(arrayList, -3):");
//        System.out.println(Collections.frequency(arrayList, -3));
//
//        System.out.println("Collections.indexOfSubList(arrayList, arrayList2):");
//        System.out.println(Collections.indexOfSubList(arrayList, arrayList2));
//
//        System.out.println("Collections.binarySearch(arrayList, 7):");
//        // 对List进行二分查找，返回索引，List必须是有序的
//        Collections.sort(arrayList);
//        System.out.println(Collections.binarySearch(arrayList, 7));

        String[] s = new String[]{
                "dog", "lazy", "a", "over", "jumps", "fox", "brown", "quick", "A"
        };
        List<String> list = Arrays.asList(s);
        Collections.reverse(list);
        System.out.println(list);
        s = list.toArray(new String[0]);//没有指定类型的话会报错
        System.out.println(Arrays.toString(s));
    }

}
