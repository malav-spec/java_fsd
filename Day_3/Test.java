package Day_3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test {

    private static boolean linearSearch(int[] arr, int n){
        for(int i : arr){
            if(i == n){
                return true;
            }
        }

        return false;
    }

    private static String getSubStr(String s, int a, int b){
        if(b >= s.length()){
            return "Enter valid range";
        }
        return s.substring(a, b);
    }

    private static String isPalin(String s){
        StringBuilder sb = new StringBuilder(s);
        String rev = String.valueOf(sb.reverse());
        if (rev.equals(s)){
            return "Yes";
        }

        return "No";
    }

    private static String isPangram(String s){
        Set<Character> alphabet = new HashSet<>();
        for(char c : s.toCharArray()){
            alphabet.add(c);
        }

        if(alphabet.size() >= 26){
            return "Pangram";
        }
        return "Not Pangram";
    }

    private static String getString(String s){
        char[] charArray = s.toCharArray();
        String temp = "";
        if(charArray[0] == 'k'){
            temp += 'k';
        }
        if(charArray[1] == 'b'){
            temp += 'b';
        }

        temp += s.substring(2);
        return temp;
    }

    private static String revSpace(String s, char c){
        StringBuilder sb = new StringBuilder(s);
        s = String.valueOf(sb.reverse());
        s = s.replace("", String.valueOf(c));
        return s.substring(1,s.length() - 1);
    }
    public static void main(String[] args) {
//        q1.
        String s = "Hello WORLD";
        System.out.println(s.toLowerCase());

//        Q2.
        s = "dello world";
        s = s.replace('d', 'h');
        System.out.println(s);

//        Q3.
        int[] arr = {10, 9, 8,7,6,5,4,3,2,1};
        Arrays.sort(arr);

        for(int n : arr){
            System.out.println(n);
        }

//        Q4.
        System.out.println(linearSearch(arr, 3));

//        Q5.
        System.out.println(getSubStr("HelloWorld", 3,7));

//        Q6.
        System.out.println(isPalin("madam"));

//        Q7.
        System.out.println(isPangram("The quick brown fox jumps over the lazy dog sp"));

//        Q8.
        System.out.println(getString("kava"));

//        Q9.
        System.out.println(revSpace("Rabbit", '-'));

//        Q10.

    }
}
