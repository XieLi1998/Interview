package leetcode_简单;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xieli on 2020/9/22.
 */
public class 罗马数字转整数 {

    public int romanToInt(String s) {
        int sum = 0;
        int preNum = getValue(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int curNum = getValue(s.charAt(i));
            if (preNum < curNum) {
                sum -= preNum;
            } else {
                sum += preNum;
            }
            preNum = curNum;
        }
        sum += preNum;
        return sum;
    }

    private int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

}
