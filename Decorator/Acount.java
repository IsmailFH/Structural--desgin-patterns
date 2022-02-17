/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author hp
 */
public class Acount implements Banck{
    private String accountNumber;

    public Acount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public void addAccount(Banck banck) {
    }

    @Override
    public String check() {
                return "\n Account : " + this.accountNumber;

    }
 
    
}
