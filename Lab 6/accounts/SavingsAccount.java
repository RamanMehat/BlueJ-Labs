
/**
 * Write a description of class SavingsAccount here.
 * 
 * @author Raman Mehat
 * @version Version 1
 */
public class SavingsAccount extends BankAccount
{
    private double intrestRate;
    private double minBalance;
    
    /**
     * calls its superclass constructor to set the balance to the specified initial balance. 
     * It also initializes the interest rate to 0, and minimum monthly balance to the initial balance.
     */
    public SavingsAccount(double initialBalance)
    {
         super(initialBalance);
         intrestRate = 0.0;
         minBalance = initialBalance;
    }
    
    /**
     * this method sets the monthly interest rate. Parameter ?rate? is the monthly interest rate, 
     * expressed as a percent (e.g., if the interest rate is 1.2%, pass 1.2 to this method).
     */
    public void setInterestRate(double rate)
    {
        intrestRate = rate;
    }
    
    /**
     * this method reduces the amount of money in the account, and if necessary updates the minimum 
     * balance. Note that the withdraw? method in ?BankAccount m?ust be called to reduce the account 
     * balance, because methods in ?SavingsAccount? cannot access the private ?balance? field 
     * defined in ?BankAccount.?This method does not need to check if the account will 
     * be overdrawn (i.e., result in a negative balance)
     */
    public void withdraw(double amount)
    {
        super.withdraw(amount); 
        if (super.getBalance() < minBalance){
            minBalance = super.getBalance() ;
        }
    }
    
    /**
     * this method calculates the monthly interest (remember, it's calculated on the m?inimum ?monthly 
     * balance, not the account balance at the end of the month), deposits this amount into the 
     * account, and then updates the minimum balance to equal the current balance.
     */
    public void monthEnd()
    {
        double montlyIntrest = minBalance * intrestRate / 100;
        super.deposit(montlyIntrest);
        minBalance = super.getBalance();
    }
}
