package Collections_Asst;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class StringSetSort {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(Arrays.asList("hi", "Hi", "Hi"));
        String[] strs = new String[set.size()];
        strs = set.toArray(strs);
        Arrays.sort(strs);
        for(String s : strs){
            System.out.println(s);
        }
    }
}
