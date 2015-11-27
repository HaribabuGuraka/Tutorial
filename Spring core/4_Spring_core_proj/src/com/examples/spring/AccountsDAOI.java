package com.examples.spring;

public interface AccountsDAOI {
	void setBalance(int acno, double amt);
	double getBalance(int acno);

}
