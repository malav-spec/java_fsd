package Exceptions;

public class Bank {
    double balance;

    public Bank(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException{
        if(amount > balance){
            throw new InsufficientFundsException("Balance should be greater than amount");
        }
    }
}
