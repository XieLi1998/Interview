package leetcode_简单;

/**
 * Created by xieli on 2020/10/12.
 */
public class 七进制数 {

    public String convertToBase7(int num) {
        if (num == 0)
            return "0";
        int number = Math.abs(num);
        StringBuilder res = new StringBuilder();
        while (number > 0) {
            int c = number % 7;
            res.append(c);
            number /= 7;
        }
        if (num < 0)
            res.append('-');
        return res.reverse().toString();
    }

}
