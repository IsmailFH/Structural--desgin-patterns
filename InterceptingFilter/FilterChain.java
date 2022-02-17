/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterceptingFilter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class FilterChain {
    
private List<Filter> filters = new ArrayList<>();
	private Target target;

	public void addFilter(Filter filter) {
		this.filters.add(filter);
	}

	public void setTarget(Target target) {
		this.target = target;
	}

	public String execute(String request) {
		String out="";
                for(Filter filter: filters)
                    out+= filter.execute(request)+"\n";
                
                out+= target.execute(request)+"\n";
              return out;
	}
}