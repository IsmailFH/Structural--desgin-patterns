/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author hp
 */
public class USDandEuro extends currencySystem{
    
    private String num;
    
    
     public USDandEuro() { 
               
    }

    @Override
    public String Calculate(double num) {
this.jd =new JD();

return "\n USD : " + this.jd.jdCurrency((int) num)*1.4 + " \n Euro :  "+this.jd.jdCurrency((int) num)*1.2;

    }
    
}
