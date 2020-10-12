package 剑指offer;

/**
 * Created by xieli on 2020/10/12.
 */
public class 不用加减乘除做加法 {

    public int add(int a, int b) {
        while (b != 0) {    // 当进位为 0 时跳出
            int c = (a & b) << 1;   // c = 进位
            a ^= b;         // a = 非进位和
            b = c;          // b = 进位
        }
        return a;
    }

    public static void main(String[] args) {
        double a = 3.1415926;
        double res = Math.round(a * 10000) / 10000.0;
        System.out.println(res);
    }

}
