package Collections_Asst;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(2,"Hi");
        map.put(1,"Hello");
        map.put(3, "world");
        int maxKey = 0;
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            if(entry.getKey() > maxKey){
                maxKey = entry.getKey();
            }
        }

        System.out.println(map.get(maxKey));
    }
}
