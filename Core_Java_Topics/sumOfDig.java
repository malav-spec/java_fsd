package Core_Java_Topics;

public class sumOfDig {

    public static int sum(int n){
        int total = 0;
        int a;
        while(n > 0){
            a = n % 10;
            total += a;
            n /= 10;
        }

        return total;
    }
    public static void main(String[] args) {
        System.out.println(sum(0));
    }
}
