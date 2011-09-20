package com.hascode.tutorial.jee;

import java.util.Date;

import javax.ejb.Stateless;

@Stateless
public class MyServiceEJB {
	public String printDate() {
		return "The date is at the moment: " + new Date().toString();
	}
}
