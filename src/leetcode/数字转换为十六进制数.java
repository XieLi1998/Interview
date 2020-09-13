package leetcode;

/**
 * Created by xieli on 2020/9/13.
 */
public class 数字转换为十六进制数 {

    public static String toHex(int num) {
        return Integer.toHexString(num);
    }

    public static String toHexV2(int num) {
        char[] chars = "0123456789abcdef".toCharArray();
        if (num == 0)
            return "0";
        StringBuilder res = new StringBuilder();
        while (num != 0) {
            //当需要对2的 n 次幂进行求余时，可以是使用 & 运算符来代替
            int idx = num & (16 - 1);
            res.append(chars[idx]);
            num >>>= 4;
        }
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(toHex(26));
    }

}
