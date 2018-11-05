import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Copyright © 2018 by afei. All rights reserved.
 * 
 * @author: afei
 * @date: 2018年11月5日
 */

public class Solution {

    public static void main(String[] args) {
        int[][] times = { { 2, 1, 1 }, { 2, 3, 1 }, { 3, 4, 1 } };
        int[][] times2 = { { 1, 2, 1 }, { 2, 3, 7 }, { 1, 3, 4 }, { 2, 1, 2 } };
        System.out.println(networkDelayTime(times, 4, 2));
        System.out.println(networkDelayTime(times2, 4, 1));
    }

    public static int networkDelayTime(int[][] times, int N, int K) {
        HashMap<Integer, NetNode> map = new HashMap<>();
        PriorityQueue<NetNode> queue = new PriorityQueue<>(N, (o1, o2) -> o1.distance - o2.distance);
        // init
        for (int i = 1; i <= N; i++) {
            NetNode node = new NetNode(i);
            if (i == K) {
                node.distance = 0;
            }
            map.put(i, node);
            queue.offer(node);
        }
        // update neighbor node
        for (int i = 0; i < times.length; i++) {
            NetNode node = map.get(times[i][0]);
            node.neighbors.put(times[i][1], times[i][2]);
        }
        // dijkstra
        while (!queue.isEmpty()) {
            NetNode min = queue.poll(); // 取出一个 time 最小的 node
            if (min.distance == Integer.MAX_VALUE) {
                return -1; // 无法到达的点
            }
            // relax
            for (int v : min.neighbors.keySet()) {
                NetNode curr = map.get(v);
                int distance = min.distance + min.neighbors.get(v);
                if (distance < curr.distance) {
                    curr.distance = distance;
                    // update queue
                    queue.remove(curr);
                    queue.add(curr);
                }
            }
        }
        // find max
        int max = 0;
        for (Map.Entry<Integer, NetNode> entry : map.entrySet()) {
            max = Math.max(max, entry.getValue().distance);
        }
        return max;
    }

    public static class NetNode {
        int u;
        HashMap<Integer, Integer> neighbors = new HashMap<>();
        int distance = Integer.MAX_VALUE;

        public NetNode(int u) {
            this.u = u;
        }
    }
}
