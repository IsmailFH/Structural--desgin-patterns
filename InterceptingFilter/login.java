/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterceptingFilter;

/**
 *
 * @author hp
 */
public class login implements Filter{

    @Override
    public String execute(String request) {

return "lgoing Request to Account :  "+ request;
    }
    
}
