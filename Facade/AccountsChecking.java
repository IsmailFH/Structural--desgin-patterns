/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author hp
 */
public class AccountsChecking {
    private accounts Checking,Saving,Merchant;
      private static AccountsChecking AccountsChecking;

    private AccountsChecking() {
        this.Checking =new Checking();
        this.Saving = new Saving();
        this.Merchant = new Merchant();
    }
    
      public static AccountsChecking getaccount() {
        if(AccountsChecking == null)
            AccountsChecking = new AccountsChecking();
        return AccountsChecking;
    }

    public String getChecking() {
        return this.Checking.Check();
    }

    public String getSaving() {
       return this.Saving.Check();
    }

    public String getMerchant() {
        return this.Merchant.Check();
    }
      
      
      
      
      
      
}
