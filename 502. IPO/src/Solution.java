import java.util.PriorityQueue;

/**
 * Copyright © 2018 by afei. All rights reserved.
 * 
 * @author: afei
 * @date: 2018年11月2日
 */

public class Solution {

    public static void main(String[] args) {

    }

    public int findMaximizedCapital(int k, int W, int[] Profits, int[] Capital) {
        // 这个队列按照收益从大到小排序，且只包含能启动的项目
        PriorityQueue<Project> profitQueue = new PriorityQueue<>((o1, o2) -> o2.profits - o1.profits);
        // 这个队列按照启动资本从小到大排序，且只包含目前资本 W 不能启动的项目
        PriorityQueue<Project> capitalQueue = new PriorityQueue<>((o1, o2) -> o1.capital - o2.capital);
        for (int i = 0; i < Profits.length; i++) {
            if (Capital[i] > W) {
                capitalQueue.add(new Project(Profits[i], Capital[i]));
            } else {
                profitQueue.add(new Project(Profits[i], Capital[i]));
            }
        }
        for (int i = 0; i < k; i++) {
            if (profitQueue.isEmpty()) {
                break; // profitQueue 为空，即没有能够启动的项目了，结束循环
            }
            W += profitQueue.poll().profits; // 取出收益最大的元素，并更新资本 W
            while (!capitalQueue.isEmpty() && W >= capitalQueue.peek().capital) {
                // 将 capitalQueue 能够启动的项目加入到 profitQueue 中
                profitQueue.offer(capitalQueue.poll());
            }
        }
        return W;
    }

    static class Project {
        int profits;
        int capital;

        public Project(int profits, int capital) {
            this.profits = profits;
            this.capital = capital;
        }
    }
}