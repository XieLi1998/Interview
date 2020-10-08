package leetcode;

import java.net.InetAddress;
import java.util.*;

/**
 * Created by xieli on 2020/10/7.
 */
public class 前K个高频元素 {

    //优先队列
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o1) - map.get(o2);
            }
        });

        for (int key : map.keySet()) {
            if (queue.size() >= k) {
                queue.offer(key);
                queue.poll();
            } else {
                queue.offer(key);
            }
        }

        int[] res = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            res[i] = queue.poll();
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(1);
    }

    //桶排序
    public int[] topKFrequentV2(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] list = new List[nums.length + 1];
        for (int key : map.keySet()) {
            int i = map.get(key);
            if (list[i] == null) {
                list[i] = new ArrayList<>();
            }
            list[i].add(key);
        }

        List<Integer> res = new ArrayList<>();
        for (int i = list.length - 1; i >= 0 && res.size() < k; i--) {
            if (list[i] == null)
                continue;
            res.addAll(list[i]);
        }

        int[] answer = new int[k];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = res.get(i);
        }
        return answer;

    }

}
