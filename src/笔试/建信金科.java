package 笔试;

import java.util.*;

/**
 * Created by xieli on 2020/9/12.
 */
public class 建信金科 {


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String res = "";
//        int i;
//        for (i = 0; i <= str.length() - 3; i++) {
//            String c1 = String.valueOf(str.charAt(i));
//            String c2 = String.valueOf(str.charAt(i + 1));
//            String c3 = String.valueOf(str.charAt(i + 2));
//            if ("c".equalsIgnoreCase(c1) && "o".equalsIgnoreCase(c2) && "c".equalsIgnoreCase(c3)) {
//                i += 3;
//                continue;
//            }
//            res += c1;
//        }
//        for (; i <= str.length() - 1; i++) {
//            String c = String.valueOf(str.charAt(i));
//            res += c;
//        }
//        System.out.println(res);
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String txt = sc.nextLine();
        HashMap<String, Integer> map = new HashMap<>();
        String[] c1 = str.substring(1, str.length() - 1).split(" ");
        String[] c2 = txt.substring(1, str.length() - 2).split(" ");
        ArrayList<String> res = new ArrayList<>();
        for (String string : c1) {
            map.put(string, map.getOrDefault(string, 0) + 1);
        }
        for (String string : c2) {
            map.put(string, map.getOrDefault(string, 0) + 1);
        }
        for (String string : map.keySet()) {
            if (map.get(string) == 1) {
                res.add(string);
            }
        }
        System.out.println(res);
    }


}
