package leetcode_简单;

/**
 * Created by xieli on 2020/9/25.
 */
public class x的平方根 {

    public static int mySqrt(int x) {
        if (x == 0 || x == 1)
            return x;

        long left = 1, right = x / 2;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;
            long postSquare = (mid + 1) * (mid + 1);
            if (x >= square && x < postSquare) {
                return (int) mid;
            } else if (square > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(4));
        System.out.println(mySqrt(10));
    }

}
