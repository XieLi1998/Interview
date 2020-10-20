package 笔试;

/**
 * Created by xieli on 2020/10/20.
 */
public class 中国系统 {


    public static int upper_bound_(int n, int v, int[] a) {
        // write code here
        int left = 0, right = a.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (a[mid] >= v)
                right = mid;
            else
                left = right + 1;
        }
        if (left == n)
            return n;
        return left;
    }

    public static void main(String[] args) {
        int n = 5;
        int v = 4;
        int[] dp = new int[]{1, 2, 4, 4, 5};
        System.out.println(upper_bound_(n, v, dp));
    }

}
