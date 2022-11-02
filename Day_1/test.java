package Day_1;

import org.w3c.dom.ls.LSOutput;

public class test {

    public static double avg(int a, int b, int c){
        return (a+b+c)/3;
    }

    public static void swap(int a, int b){
        int c = a;
        a = b;
        b = c;

        System.out.println("After swap | a: " + a + " b: " + b);
    }

    public static boolean checkPrime(int a){
        int count = 0;

        for(int i = 1; i <= a; i++){
            if(a%i == 0){
                count++;
            }

            if(count > 2){
                return false;
            }
        }

        return true;
    }

    public static int ascii(char a){
        return (int)a;
    }

    public static void fizzBuzz(){
        for(int i = 1; i <= 100; i++){
            if(i%3 == 0 && i %5 == 0){
                System.out.println("fizz buzz");
            }
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }
            else if(i % 3 == 0){
                System.out.println("Fizz");
            }
        }
    }

    private static String getLargestWord(String s) {
        String[] s_split = s.split(" ");
        int max = 0;
        int idx = 0;
        for(int i = 0; i < s_split.length; i++){
            if(s_split[i].length() > max){
                idx = i;
                max = s_split[i].length();
            }
        }

        return s_split[idx];
    }

    private static int sumOfSquares(int n) {
        int b;
        int sum = 0;

        while(n > 0){
            b = n%10;
            if(b % 2 == 0){
                sum += (b*b);
            }

            n /= 10;
        }
        return sum;
    }

    private static String checkSum(int n) {
        int b;
        int sum = 0;

        while(n > 0){
            b = n%10;
            if(b % 2 != 0){
                sum += b;
            }

            n /= 10;
        }

        if (sum % 2 == 0){
            return "sum of odd digits is even";
        }
        else{
            return "sum of odd digits is odd";
        }
    }
    public static void main(String[] args) {

//        Q1.
        System.out.println(-5+8*6);
        System.out.println((55+9)%9);
        System.out.println(20+-3*5/8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3 );

//        Q2.

        System.out.println(20/4);
        System.out.println(20+4);
        System.out.println(20-4);
        System.out.println(20*4);

//        Q3.

        System.out.println(avg(1,2,3));

//        Q4.
        swap(1,2);

//        Q5.
        System.out.println(checkPrime(29));

//        Q6.
        System.out.println(ascii('b'));

//        Q7.
        fizzBuzz();

//        Q8.
        System.out.println(checkSum(0));

//        Q9.
        System.out.println(sumOfSquares(56895));

//        Q10.
        System.out.println(getLargestWord("ABC DEF"));

//        Q11.
        StringSwap("Hello", "world");
    }

    private static void StringSwap(String s1, String s2) {
        s1 += " " + s2;
        s2 = s1.split(" ")[0];
        s1 = s1.split(" ")[1];

        System.out.println(s1 + " " + s2);
    }
}
