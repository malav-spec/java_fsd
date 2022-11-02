package Asst_5;

import com.sun.source.tree.Tree;

import java.util.*;

public class listDemo {
    private static void LinkedListDemo(){
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        System.out.println(list.get(0));
        System.out.println(list.getLast());
        list.remove(list.size()/2);
        for(int i = 1; i < list.size() - 1; i++){
            System.out.println(list.get(i));
        }
    }

    private static Character SetDemo(String s){
        Set<Character> words = new HashSet<>();
        char[] arr = s.toCharArray();
        for(char c : arr){
            if(words.contains(c)){
                return c;
            }

            words.add(c);
        }

        return null;
    }

    private static void TreeSetDemo(){
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(5,4,3,2,1));
        System.out.println("Ascending: ");
        System.out.println(set);
        System.out.println("Descending: ");
        System.out.println(set.descendingSet());
    }
    public static void main(String[] args) {
        System.out.println(SetDemo("Hello"));
        TreeSetDemo();
    }
}
