package com.wophy.algorithms.queue;

import java.util.ArrayDeque;

public class ArrayDequeTest {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.add(2);
        System.out.println(deque);

        System.out.println(deque.poll());
        System.out.println(deque.poll());
        System.out.println(deque.poll());
        System.out.println(deque.poll());
    }
}
