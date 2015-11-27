package com.examples.spring;

public class WithdrawService {
	
	private AccountsDAOI adao;
	private CheckMinBal checkMinBal;
	
	public WithdrawService(AccountsDAOI adao){
		System.out.println("Initializing ws");
		this.adao=adao;
	}
	public void setCheckMinBal(CheckMinBal c){
		checkMinBal=c;
	}

	public boolean withdraw(int acno, double amt)
	{
		System.out.println("in withdraw "+ acno);
		double bal=adao.getBalance(acno);
		bal-=amt;
		if (checkMinBal.checkBalance(acno, bal))
		{
			adao.setBalance(acno, bal);
			return true;
		}
		return false;
	}
	
}
