package _12Collections._09PriorityQueueDemo;

import _12Collections._08QueueDemo.QueueDemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author Aaron
 * @date 2021-02-22 15:21
 */
public class PriorityQueueDemo {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(25, 22, 20,
                18, 14, 9, 3, 1, 1, 2, 3, 9, 14, 18, 21, 23, 25);
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(ints);
        QueueDemo.printQ(priorityQueue);// 1 1 2 3 3 9 9 14 14 18 18 20 21 22 23 25 25 

        priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        priorityQueue.addAll(ints);
        System.out.println(priorityQueue);// [25, 25, 21, 23, 14, 14, 20, 22, 1, 2, 3, 9, 9, 3, 18, 1, 18]
        QueueDemo.printQ(priorityQueue); // 25 25 23 22 21 20 18 18 14 14 9 9 3 3 2 1 1 
    }
}
