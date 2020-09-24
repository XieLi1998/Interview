package leetcode_简单;

/**
 * Created by xieli on 2020/9/25.
 */
public class 最后一个单词的长度 {

    public int lengthOfLastWord(String s) {
        int count = 0, i = s.length() - 1;
        while (i >= 0) {
            if (s.charAt(i--) != ' ')
                count++;
            else if (count > 0)
                return count;
        }
        return count;
    }

}
