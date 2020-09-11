package 笔试;

import java.util.Arrays;

/**
 * Created by xieli on 2020/9/10.
 */
public class 途虎养车 {


    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * calculate combination Number
     *
     * @param r int整型
     * @param n int整型
     * @return int整型
     */
    public static int combination(int r, int n) {
        // write code here

        int upSum = 1;
        for (int i = n; i > r; i--) {
            upSum *= i;
        }

        int downSum = 1;

        for (int i = n - r; i >= 1; i--) {
            downSum *= i;
        }

        return upSum / downSum;
    }

    public static void main(String[] args) {
        System.out.println(combination(2, 3));
    }

    public int[] arrayMerge(int[] array1, int n, int[] array2, int m) {
        // write code here
        int[] res = new int[m + n];
        int idx = 0;
        for (int num : array1) {
            res[idx++] = num;
        }
        for (int num : array2) {
            res[idx++] = num;
        }
        Arrays.sort(res);
        return res;
    }

}
