import data.Account;
import data.CheckingAccounts;
import data.Customer;

public class Application {

    public static void main(String[] args) {
        Customer customer = new Customer(12, "Ziya", "22.08.2002", "hoihf@hoit.com", "Codecool");
        int CustomerId = customer.getId();
        Account customerAccount = new Account(CustomerId);

        CheckingAccounts checkingAccounts = new CheckingAccounts(customer, "First");
        checkingAccounts.setBalance(1_000_000.90);


        System.out.println(checkingAccounts.toString());
    }

}
