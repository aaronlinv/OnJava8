package _12Collections._06Stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Aaron
 * @date 2021-02-22 12:00
 * 基于ArrayDeque的Stack
 */
public class Stack<T> {
    private Deque<T> storage = new ArrayDeque<>();

    public void push(T v) {
        storage.push(v);
    }

    public T pop() {
        return storage.pop();
    }

    public T peek() {
        return storage.peek();
    }

    public boolean isEmpty() {
        return storage.isEmpty();
    }

    @Override
    public String toString() {
        return storage.toString();
    }
}

class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for (String s : "My dog has fleas".split(" ")) {
            stack.push(s);
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}