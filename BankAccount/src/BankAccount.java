/**
 * Created by kritisharma on 8/21/19.
 */
public class BankAccount
{
    int accountNumber;
    int balance;
    String customerName;
    String email;
    int phoneNumber;

    public void setAccountNumber(int accountnumber)
    {
        this.accountNumber = accountnumber;
    }

    public void setBalance(int balance)
    {
        this.balance = balance;
    }

    public void setCustomerName(String customername)
    {
        this.customerName = customername;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setPhoneNumber(int phonenumber)
    {
        this.phoneNumber = phonenumber;
    }

    public int getAccountNumber()
    {
        return this.accountNumber;
    }

    public int getBalance()
    {
        return this.balance;
    }

    public String getCustomerName()
    {
        return this.customerName;
    }

    public String getEmail()
    {
        return this.email;
    }

    public int getPhoneNumber()
    {
        return this.phoneNumber;
    }

    ////////////////those were all the setters and getters//////////////
    //moving on//

    public void deposit(int depositAmount)
    {
        System.out.println("the current amount is now " + (this.balance + depositAmount));
    }

    public void withdraw(int withdrawAmount)
    {
        if ( this.balance < withdrawAmount )
        {
            System.out.println("Sorry, you cannot withdraw that much money, or you will go into debt");
        }
        else
        {
            System.out.println("the current amount is now " + (this.balance - withdrawAmount));
        }
    }

}
