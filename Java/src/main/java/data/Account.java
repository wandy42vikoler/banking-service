package data;

import java.util.HashMap;

public class Account{

    private final int CustomerId;
    private double balance = 0;

    public Account(int customerId) {
        CustomerId = customerId;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}