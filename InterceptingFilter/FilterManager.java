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
public class FilterManager {
 private FilterChain filterChain;


	public FilterManager(Target target) {
		this.filterChain = new FilterChain();
                this.filterChain.setTarget(target);
	}

	public void setFilter(Filter filter) {
		this.filterChain.addFilter(filter);
	}

	public String filterRequest(String request) {
		return this.filterChain.execute(request);
	}
}