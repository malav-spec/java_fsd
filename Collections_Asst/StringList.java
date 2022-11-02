package Collections_Asst;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StringList {

    private static String[] convertToStringArray(ArrayList<String> list){
        String[] strArray = new String[list.size()];
        Collections.sort(list);
        strArray = list.toArray(strArray);
        return strArray;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 strings: ");
        int n = 5;
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(sc.nextLine());
        }

        String[] strs = convertToStringArray(list);
        for(String s: strs){
            System.out.println(s);
        }
    }
}
