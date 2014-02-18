package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import code.Accounts;
import code.DepositMoneyHandler;
import code.Display;

public class DepositMoneyHandlerTest {
	
	private DepositMoneyHandler classUnderTest;

	@Before
	public void setUp() throws Exception {
		Accounts accounts = new Accounts();
		accounts.deposit(accounts.openNewAccount(), 100);
		accounts.deposit(accounts.openNewAccount(), 200);
		
		Display display = new Display();
		
		classUnderTest = new DepositMoneyHandler(accounts, display);
	}


	@Test
	public void testDepositMoneyAccount() {
		
		Integer accountTested = 1;
		Integer sumTested = 100;
		
		
		
		assertTrue("Balence updated",classUnderTest.depositMoneyAccount(accountTested, sumTested));

		
		
		
	}

}
