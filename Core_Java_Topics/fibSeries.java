package Core_Java_Topics;

import java.util.Scanner;

public class fibSeries {
    public static void getFib(int n){
        int a = 0, b = 1;
        int c;

        System.out.println(a);
        System.out.println(b);

        for(int i = 2; i < n; i++){
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter limit: ");
        int n = sc.nextInt();

        getFib(n);
    }
}
