package leetcode_简单;

/**
 * Created by xieli on 2020/9/25.
 */
public class 二进制求和 {

    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int carry = 0;
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int sum = carry;
            sum += i >= 0 ? a.charAt(i) - '0' : 0;
            sum += j >= 0 ? b.charAt(j) - '0' : 0;
            res.append(sum % 2);
            carry = sum / 2;
        }

        res.append(carry == 1 ? carry : "");
        return res.reverse().toString();
    }

}
