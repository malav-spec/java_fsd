package Asst_3;

import Exceptions.InsufficientFundsException;

public interface IBankMaster {
    void deposit(double amt);
    void withdraw(double amt) throws InsufficientBalException;
}
