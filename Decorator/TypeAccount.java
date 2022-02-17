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
public class TypeAccount implements Banck{
    protected Banck banck;

    @Override
    public void addAccount(Banck banck) {
        this.banck=banck;
    }

    @Override
    public String check() {
        return this.banck.check();
    }
    
}
