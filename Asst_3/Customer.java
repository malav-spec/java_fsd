package Asst_3;

public class Customer extends BankMaster{
    public static void main(String[] args) throws InsufficientBalException {
        Customer customer = new Customer();
        customer.viewBalance();

//        customer.withdraw(60000);

        customer.deposit(20000);
        customer.viewBalance();
    }
}
