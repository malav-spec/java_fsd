package Core_Java_Topics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class countChars {
    public static void countUniqueAndCommon(String s1, String s2){
        Set<Character> words = new HashSet<>();
        int unique = 0;
        int common = 0;

        for(int i = 0; i < s1.length(); i++){
            words.add(s1.charAt(i));
        }

        for(int i = 0; i < s2.length(); i++){
            char chr = s2.charAt(i);
            if(words.contains(chr)){
                common++;
            }
            else{
                unique++;
            }
        }

        System.out.println("Common: " + common);
        System.out.println("Unique: " + unique);
    }

    public static void countAll(String s){
        Set<Character> vowelSet = new HashSet<>(Arrays.asList('a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'));
        int vowels = 0, space = 0, digits = 0, cons = 0;
        for(int i = 0; i < s.length(); i++){
            char chr = s.charAt(i);
            if(Character.isWhitespace(chr)){
                space++;
            }
            else if(Character.isDigit(chr)){
                digits++;
            }
            else if(vowelSet.contains(chr)){
                vowels++;
            }
            else if(Character.isAlphabetic(chr)){
                cons++;
            }
        }

        System.out.println("White Space: " + space);
        System.out.println("Digits: " + digits);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + cons);
    }
    public static void main(String[] args) {
        countUniqueAndCommon("Hello", "World");
        countAll("Hello123 A");
    }
}
