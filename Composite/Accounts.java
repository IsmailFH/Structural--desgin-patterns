/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class Accounts {
     private int id;
    
       private List<Accounts> listOfAccounts;

    public Accounts(int id) {
        this.id = id;
        this.listOfAccounts=new ArrayList<>();
    }

        public void addAccount(Accounts Account){
        this.listOfAccounts.add(Account);
    }
    
    public void removeAccount(Accounts account){
        this.listOfAccounts.remove(account);
    }

    public List<Accounts> getAccounts() {
        return listOfAccounts;
    }


    @Override
    public String toString() {
        return this.id +" " ;
    }
    
    
       
    
}
