package it.prova.ejb;

import javax.ejb.Stateless;

@Stateless
public class HelloEnterprise {
	
	public String helloEJB() {
		return "hello EJB";
	}

}
