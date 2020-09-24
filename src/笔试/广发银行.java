package 笔试;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by xieli on 2020/9/24.
 */
public class 广发银行 {

    public static String sortVersion(String versions) {
        // write code here
        String[] sortVersions = versions.split(" ");
        Arrays.sort(sortVersions, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
//        StringBuilder res = new StringBuilder();
//        for (int i = 0; i < sortVersions.length; i++) {
//            res.append(sortVersions[i]);
//            if (i != sortVersions.length - 1)
//                res.append(",");
//        }
//        return res.toString();
        ArrayList<String> ans = new ArrayList<>();
        for (String o1 : sortVersions) {
            ans.add(o1);
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(sortVersion("3.1 2.2 1.0 6.4 4.5 5.2"));
        System.out.println(sortVersion("2.x 3.1.x 3.0 2.y 4.x.y"));
    }

}
