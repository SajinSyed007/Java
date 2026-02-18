
package mainsystem.acc;


public class CurrentAccount extends Account{
    
    public float overdraftLimit;

    public CurrentAccount() {
    }

    public CurrentAccount(float overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public CurrentAccount(float overdraftLimit, int accountNumber, String accountHolderName, int balance) {
        super(accountNumber, accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }
    
    public void withdraw(double amount){
           System.out.println("Withdrawed balance : " + (balance -= amount));
    }
}
