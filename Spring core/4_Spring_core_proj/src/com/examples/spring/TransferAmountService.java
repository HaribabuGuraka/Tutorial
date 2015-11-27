package com.examples.spring;

public class TransferAmountService {
	
	private WithdrawService withdrawService;
	private DepositService depositService;
	
	public TransferAmountService (){
		System.out.println("Initializing taservic");
	}

	public void setDepositService(DepositService s)
	{
		depositService=s;
	}
	public void setWithdrawService(WithdrawService s)
	{
		withdrawService=s;
	}

	public boolean transferAmount(int sacno, int dacno, double amt)
	{
		System.out.println("in TA "+ sacno+" , "+ dacno);
		
		if(withdrawService.withdraw(sacno, amt))
		{
			return depositService.deposit(dacno, amt);
		}
		return false;
	}

	
}
