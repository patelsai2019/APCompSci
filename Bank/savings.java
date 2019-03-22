public class Savings extends Account{
    protected double balance;
    int customer;

    Savings(int newCustomer, double newBalance) {
        int customer = newCustomer;
        double balance = newBalance;
        System.out.printf("Account %d created.", customer);
    }

    public void alter(double amount) {
        balance += amount;
    }
}
