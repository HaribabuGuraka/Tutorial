package com.examples.spring;

public class AccountsDAO implements AccountsDAOI {
	
	public AccountsDAO(){
		System.out.println("Initializing AccountsDAO");
	}
	//TO DO : JDBC Code to access DB
	public void setBalance(int acno, double amt){
		System.out.println("in setBalace : "+ acno);
	}
	public double getBalance(int acno){
		System.out.println("in getBalace : "+ acno);
		return 5000;
	}
}
