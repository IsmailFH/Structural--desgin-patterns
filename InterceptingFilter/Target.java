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
public class Target {
  
	public String execute(String aRequest) {
		return "Target Request: "+ aRequest +" >> Verified successfully";
	}
}