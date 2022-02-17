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
public class Checking1 extends TypeAccount{
    
    @Override
    public void addAccount(Banck banck) {
        super.addAccount(banck);
    }
    
    @Override
    public String check() {
        return super.check() + "\n Checking type"; 
    }    
}
