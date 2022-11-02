package Asst_3;

import Exceptions.InsufficientFundsException;

public abstract class BankMaster implements IBankMaster{
    private static double balance = 5000;
    @Override
    public void deposit(double amt) {
        balance += amt;
    }

    @Override
    public void withdraw(double amt) throws InsufficientBalException {
        if(amt > balance){
            throw new InsufficientBalException("Insufficient Balance!");
        }

        balance -= amt;
    }

    public void viewBalance(){
        System.out.println("Balance: " + balance);
    }
}
