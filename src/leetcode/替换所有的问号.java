package leetcode;

/**
 * Created by xieli on 2020/9/14.
 */
public class 替换所有的问号 {

    public String modifyString(String s) {
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '?') {
                char ahead = i == 0 ? ' ' : chars[i - 1];
                char behind = i == chars.length - 1 ? ' ' : chars[i + 1];

                char temp = 'a';
                while (temp == ahead || temp == behind) {
                    temp++;
                }
                chars[i] = temp;
            }
        }
        return new String(chars);
    }

}
