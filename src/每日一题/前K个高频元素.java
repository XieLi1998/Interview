package 每日一题;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * Created by xieli on 2020/9/7.
 */
public class 前K个高频元素 {

    //347. 前 K 个高频元素
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        //默认创建小顶堆，堆顶为最小
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o1) - map.get(o2);
            }
        });
        for (Integer key : map.keySet()) {
            //此处为等于k时，即不能插入堆了
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

}
