
/**
 * Write a description of class ChequingAccount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChequingAccount extends BankAccount
{
    private double withdrawals;
    public static final int FREEWITHDRAWAL = 3;
    public static final int FEE = 1;

    /**
     * calls its superclass constructor to set the balance to the specified initial balance. 
     * It also initializes the counter that keeps track of the number of withdrawals to 0.
     */
    public ChequingAccount(double initialBalance)
    {
        super(initialBalance);
        withdrawals = 0.0;
    }

    /**
     * in addition to withdrawing the specified amount of money from the account, this method will 
     * update the withdrawal counter. If the number of withdrawals in the month exceeds the number of 
     * free withdrawals, the $1 transaction fee is charged when the money is withdrawn. Note that the 
     * w?ithdraw? method in ?BankAccount ?must be called to reduce the account balance, because methods in ?
     * ChequingAccount? cannot access the private b?alance?field defined in ?BankAccount.?
     * (i.e., results in a negative balance).
     */
    public void withdraw(double amount)
    {
        super.withdraw(amount);
        withdrawals++;
        if (withdrawals > FREEWITHDRAWAL){
            super.withdraw(FEE);
        }
    }
    
    /**
     * this method simply resets the withdrawal counter to 0
     */
    public void monthEnd()
    {
        withdrawals = 0.0;
    }
}
