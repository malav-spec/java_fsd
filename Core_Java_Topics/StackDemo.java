package Core_Java_Topics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StackDemo<T> implements Stack<T>{
    public List<T> arrayList;
    public StackDemo() {
        arrayList = new LinkedList<>();
    }

    @Override
    public T Pop() {
        return arrayList.get(arrayList.size() - 1);
    }

    @Override
    public void Push(T data) {
        arrayList.add(data);
    }

    public static void main(String[] args) {
        StackDemo<Integer> stack = new StackDemo<>();
        stack.Push(12);
        stack.Push(23);
        System.out.println(stack.arrayList);
        System.out.println(stack.Pop());
    }
}
