package Collections_Asst;

import java.util.HashMap;
import java.util.Scanner;

public class StateID {
    private static HashMap<String, String> getStateID(String[] states){
        HashMap<String, String> states_id = new HashMap<>();
        for(String s : states){
            states_id.put(s, s.substring(0,3));
        }

        return states_id;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] states = new String[4];
        for(int i = 0; i < 4; i++){
            states[i] = sc.nextLine();
        }

        System.out.println(getStateID(states));
    }
}
