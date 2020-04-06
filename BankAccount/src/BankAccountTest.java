/**
 * Created by kritisharma on 8/21/19.
 */
public class BankAccountTest
{
    public static void main(String[] args)
    {
        BankAccount newAccount = new BankAccount();

        newAccount.setAccountNumber(23);
        newAccount.setBalance(2000);
        newAccount.setCustomerName("Kriti");
        newAccount.setEmail("kriti.sharma@hello.com");
        newAccount.setPhoneNumber(1234567890);

        newAccount.deposit(3000);
        newAccount.withdraw(2000);
        newAccount.withdraw(7000);

    }
}
