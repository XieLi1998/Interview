package labuladong;

import java.util.HashMap;

/**
 * Created by xieli on 2020/9/14.
 */
public class LRUCache {
    class Node {
        public int key, value;
        public Node prev, next;

        public Node(int k, int v) {
            this.key = k;
            this.value = v;
        }
    }

    class DoubleList {

        private Node head, tail;
        private int size;

        public void addFirst(Node x) {
            if (head == null) {
                head = tail = x;
            } else {
                Node cur = head;
                cur.prev = x;
                x.next = cur;
                head = x;
            }
            size++;
        }

        public void remove(Node x) {
            if (head == x && tail == x) {
                head = tail = null;
            } else if (tail == x) {
                x.prev.next = null;
                tail = x.prev;
            } else if (head == x) {
                x.next.prev = null;
                head = x.next;
            } else {
                x.prev.next = x.next;
                x.next.prev = x.prev;
            }
            size--;
        }

        public Node removeLast() {
            Node x = tail;
            remove(x);
            return x;
        }

        public int size() {
            return size;
        }
    }

    private HashMap<Integer, Node> map;
    private DoubleList cache;
    private int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<Integer, Node>();
        cache = new DoubleList();
    }

    public int get(int key) {
        if (!map.containsKey(key))
            return -1;
        int val = map.get(key).value;
        put(key, val);
        return val;
    }

    public void put(int key, int value) {
        Node x = new Node(key, value);

        if (map.containsKey(key)) {
            cache.remove(map.get(key));
        } else {
            if (capacity == cache.size()) {
                Node last = cache.removeLast();
                map.remove(last.key);
            }
        }
        cache.addFirst(x);
        map.put(key, x);
    }

}
