package Collections_Asst;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(1,2,3,4));
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4));
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Hello");
        map.put(2,"World");
    }
}
