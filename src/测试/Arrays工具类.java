package 测试;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by xieli on 2020/9/29.
 */
public class Arrays工具类 {

    public static void main(String[] args) {
        // *************填充fill(批量初始化)****************
        int[] g = {1, 2, 3, 3, 3, 3, 6, 6, 6};
        // 数组中所有元素重新分配值
        Arrays.sort(g);
        System.out.println(Arrays.toString(g));

        Integer[] G = new Integer[g.length];
        for (int i = 0; i < g.length; i++) {
            G[i] = g[i];
        }
        Arrays.sort(G, Collections.reverseOrder());
        System.out.println(Arrays.toString(G));

        try (BufferedInputStream bin = new BufferedInputStream(new FileInputStream(new File("test.txt")));
             BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(new File("out.txt")))) {
            int b;
            while ((b = bin.read()) != -1) {
                bout.write(b);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
