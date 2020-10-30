package 笔试;

/**
 * Created by xieli on 2020/10/24.
 */
public class 兴业银行 {

    public static String changeFormatNumber(String number) {
        // write code here
        int a = Integer.parseInt(number);
        int x = Math.abs(a);
        int[] res = new int[16];
        int m, temp = 0;
        for (int i = 0; i < 16; i++) {
            m = x % 2;
            x = x / 2;
            res[i] = m;
        }


        if (a < 0) {
            for (int i = 0; i < 16; i++) {
                if (res[i] == 0)
                    res[i] = 1;
                else
                    res[i] = 0;
            }


            for (int i = 15; i >= 0; i--) {
                if (res[i] == 1)
                    temp += Math.pow(2, i);
                temp += 1;
            }

            for (int i = 0; i < 16; i++) {
                m = temp % 2;
                temp = temp / 2;
                res[i] = m;
            }

        }

        String ans = new String();
        for (int i = 15; i >= 0; i--) {
            ans += res[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(changeFormatNumber("-1"));
    }

}
