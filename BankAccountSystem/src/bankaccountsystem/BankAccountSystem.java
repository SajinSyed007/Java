
package bankaccountsystem;

import bankaccountsystem.acc.AccountStatus;


public class BankAccountSystem {

 
    public static void main(String[] args) {
        
        AccountStatus as = new AccountStatus();
        
        as.setDeposit(700);
        as.deposit();
        System.out.println("Current Balance : "+as.getBalance());
        
        as.setWithdraw(500);
        as.withdraw();
        
        System.out.println("Remaining Balance : "+as.getBalance());
    }
    
}
