package code;

public class DepositMoneyHandler {
	
	
	private Accounts accounts;
	private Display display;
		
	public DepositMoneyHandler(Accounts accounts, Display display) {
		this.accounts = accounts;
		this.display = display;
	}
	
	public boolean depositMoneyAccount(Integer accountNumber, Integer sum) {
		if(!accounts.doesAccountExist(accountNumber)){
			display.displayString("Account number: " + accountNumber + "  does not exist");
			return false;
		}
		
		accounts.deposit(accountNumber, sum);
		
		display.displayString("Your new balence is: " + accounts.getBalance(accountNumber));
		return true;
	}

}
