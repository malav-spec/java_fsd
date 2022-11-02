package Core_Java_Topics;

public class findMaxChar {
    public static String getMaxChar(String s1, String delimiter){
        String[] strArray = s1.split(delimiter);
        String maxLen = "";
        int max = 0;
        for(String s : strArray){
            if(s.length() > max){
                max = s.length();
                maxLen = s;
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(getMaxChar("Hello#Wo","#"));
    }
}
