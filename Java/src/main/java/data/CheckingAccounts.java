package data;

import java.util.HashMap;
import java.util.LinkedList;

public class CheckingAccounts {

    private final Customer customer;
    private double balance = 0;
    private String name;

    public CheckingAccounts(Customer customer, String name) {
        this.name = name;
        this.customer = customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "CheckingAccounts{" +
                "balance=" + balance +
                ", checkingAccount=" + name +
                '}';
    }
}
