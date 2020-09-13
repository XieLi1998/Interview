package leetcode;

/**
 * Created by xieli on 2020/9/13.
 */
public class 七进制数 {

    public static String convertToBase7(int num) {
        int flag = 1;
        if (num < 0) {
            num = -num;
            flag = -1;
        }
        StringBuilder res = new StringBuilder();
        if (num == 0)
            return "0";
        while (num != 0) {
            int idx = num % 7;
            res.append(idx);
            num /= 7;
        }
        if (flag == -1) {
            res.append("-");
        }
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(convertToBase7(100));
    }

}
