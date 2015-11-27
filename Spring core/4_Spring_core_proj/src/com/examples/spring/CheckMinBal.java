package com.examples.spring;

public class CheckMinBal {
	public CheckMinBal(){
	System.out.println("Initializing CheckMinBal");
	}
	public boolean checkBalance(int acno, double amt) {
		System.out.println("in checkBalance : "+ acno);
		return (amt >= 1000);
	}
}
