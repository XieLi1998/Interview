package 面筋;

/**
 * Created by xieli on 2020/8/31.
 */
public class multiply {

    //43. 字符串相乘，又名“大数相乘”
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0"))
            return "0";
        int[] res = new int[num1.length() + num2.length()];

        for (int i = num1.length() - 1; i >= 0; i--) {
            int x = num1.charAt(i) - '0';
            for (int j = num2.length() - 1; j >= 0; j--) {
                int y = num2.charAt(j) - '0';
                int sum = res[i + j + 1] + x * y;
                res[i + j + 1] = sum % 10;
                //此处必须为 +=
                res[i + j] += sum / 10;
            }
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < res.length; i++) {
            if (i == 0 && res[i] == 0)
                continue;
            ans.append(res[i]);
        }
        return ans.toString();
    }


    //415. 字符串相加，双指针
    public String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int i = num1.length() - 1, j = num2.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            res.append(sum % 10);
            i--;
            j--;
        }
        if (carry != 0)
            res.append(carry);
        return res.reverse().toString();
    }

}
