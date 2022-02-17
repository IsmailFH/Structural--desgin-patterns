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
public class Client {
    private FilterManager filterManager;


	public Client(FilterManager filterManager) {
		this.filterManager= filterManager;
	}

	public String sendRequest(String request) {
		return this.filterManager.filterRequest(request);
	}
}