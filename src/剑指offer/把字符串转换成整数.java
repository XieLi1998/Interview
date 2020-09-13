package 剑指offer;

/**
 * Created by xieli on 2020/9/13.
 */
public class 把字符串转换成整数 {

    public static int strToInt(String str) {
        int flag = 1, idx = 1;
        char[] chars = str.trim().toCharArray();
        if (chars.length == 0)
            return 0;
        if (chars[0] == '-') {
            flag = -1;
        } else if (chars[0] != '+') {
            idx = 0;
        }
        int res = 0;
        while (idx < chars.length) {
            if (chars[idx] < '0' || chars[idx] > '9')
                break;
            if (res > Integer.MAX_VALUE / 10 || res == Integer.MAX_VALUE / 10 && chars[idx] > '7')
                return flag == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            res = res * 10 + (chars[idx] - '0');
            idx++;
        }
        return flag * res;
    }

    public static void main(String[] args) {
        System.out.println(strToInt("-91283472332"));
    }

}
