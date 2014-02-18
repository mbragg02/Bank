package code;

public class Teller {

	private OpenAccountHandler openAccountRequest;
	private WithdrawMoneyHandler withdrawMoneyRequest;
	private DepositMoneyHandler depositMoneyHandler;

	public Teller(OpenAccountHandler openAccountRequest, WithdrawMoneyHandler withdrawMoneyRequest, DepositMoneyHandler depositMoneyHandler) {
		this.openAccountRequest = openAccountRequest;
		this.withdrawMoneyRequest = withdrawMoneyRequest;
		this.depositMoneyHandler = depositMoneyHandler;
	}

	public boolean openAccount(String string) {
		return openAccountRequest.openAccount(string);
	}

	public boolean withdraw(Integer accountTested, Integer sumTested) {
		return withdrawMoneyRequest.withdraw(accountTested, sumTested);
	}
	
	public boolean deposit(Integer accountTested, Integer sumTested){
		return depositMoneyHandler.depositMoneyAccount(accountTested, sumTested);
	}

}
