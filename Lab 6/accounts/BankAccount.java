
/**
 * Write a description of class BankAccount here.
 * 
 * @author Raman Mehat
 * @version Version 1
 */
public class BankAccount
{
    private double balance;
  
     /**
     * the constructor always sets the balance to the specified initial balance.
     */
    public BankAccount(double initialBalance)
    {
        balance = initialBalance;
    }

     /**
     * this method increases the balance by the specified amount.
     */
    public void deposit(double amount)
    {
        balance = balance + amount;
    }
    
     /**
     * this method decreases the balance by the specified amount. No check is made to see if the account will be overdrawn
     */
    public void withdraw(double amount)
    {
        balance = balance - amount;
    }
    
     /**
     * this method returns the current balance
     */
    public double getBalance()
    {
        return balance;
    }
}
