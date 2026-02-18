
package mainsystem.acc;


public class SavingsAccout extends Account{
    
    public float interestRate;

    public SavingsAccout() {
    }

    public SavingsAccout(float interestRate) {
        this.interestRate = interestRate;
    }

    public SavingsAccout(float interestRate, int accountNumber, String accountHolderName, int balance) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

   public 
}
