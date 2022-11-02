package Asst_2;

public class Q1 {
    public static void main(String[] args) {
        String num = "123456789876";
        char[] charArray = num.toCharArray();
        for(int i = 0; i < 8; i++){
            charArray[i] = 'x';
        }

        num = new String(charArray);
        System.out.println(num);
    }
}
