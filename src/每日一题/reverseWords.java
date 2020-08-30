package 每日一题;

/**
 * Created by xieli on 2020/8/30.
 */
public class reverseWords {

    //557.  反转字符串中的单词 III
    public String reverseWords(String s) {
        StringBuffer ret = new StringBuffer();
        int len = s.length();
        int start = 0, i = 0;
        while (i < len) {
            while (i < len && s.charAt(i) != ' ') {
                i++;
            }
            for (int j = start; j < i; j++) {
                ret.append(s.charAt(start + i - 1 - j));
            }
            while (i < len && s.charAt(i) == ' ') {
                i++;
                ret.append(' ');
            }
            start = i;
        }
        return ret.toString();
    }

}
