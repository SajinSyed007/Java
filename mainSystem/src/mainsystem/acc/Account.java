
package mainsystem.acc;


public class Account {
    
    public int accountNumber;
    public String accountHolderName;
    public int balance;

    public Account() {
    }

    public Account(int accountNumber, String accountHolderName, int balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    
    public double deposit(){
        return balance;
    }
    
    public String displayAccountInfo(){
        System.out.println("");
       
    }       
}
