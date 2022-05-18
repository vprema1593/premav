package com.tcs.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Emp {
/*	@Autowired
	@Qualifier("address1") */
	private Address address;
	
	/*	@Autowired
	@Qualifier("exp1") */
	private Exp exp;
	
	
	@Autowired
	
	public Emp(@Qualifier("address1") Address address,@Qualifier("exp1") Exp exp) {
		super();
		this.address = address;
		this.exp = exp;
	}
	
	public Emp() {}
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Exp getExp() {
		return exp;
	}
	public void setExp(Exp exp) {
		this.exp = exp;
	}
	@Override
	public String toString() {
		return "Emp [address=" + address + ", exp=" + exp + "]";
	}
	
}
