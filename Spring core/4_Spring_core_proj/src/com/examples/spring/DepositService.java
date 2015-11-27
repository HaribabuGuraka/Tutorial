package com.examples.spring;

public class DepositService {
	
	private AccountsDAOI adao;
	
	public DepositService(AccountsDAOI adao){
		System.out.println("Initializing depositSrevice");
		this.adao=adao;
	}

	public boolean deposit(int acno, double amt){
		System.out.println("in deposit "+ acno);
		double bal=adao.getBalance(acno);
		bal+=amt;
		adao.setBalance(acno, bal);
		return true;		
	}
	
}
