package Exceptions;

public class BankDemo {
    public static void main(String[] args) {
        Bank b = new Bank(2000);
        try {
            b.withdraw(3000);
        }catch (InsufficientFundsException e){
            System.out.println(e.getMessage());
        }
    }
}
