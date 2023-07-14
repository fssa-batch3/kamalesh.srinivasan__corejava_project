package day05.practice;
import day05.practice.Account;

public class TestATM {

	public static void main(String[] args) {

		Account account1 = new Account("9813265135328765913",20000.18);
		 ATM Axis = new AxisATM();
		try{
			Axis.withdraw(account1, 6000);
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		 }
		Axis.deposit(account1, 20000);
		System.out.println(Axis.getBalance(account1));
		
		 Account account2 = new Account("513455345325234",200400.18);
			
		   ATM Icici = new IciciATM();
		  try{
			  Icici.withdraw(account2, 200400);
		  }
		   catch (Exception e) {
		  	System.err.println(e.getMessage());
		  }
		  Icici.deposit(account2, 100);
	        System.out.println(Icici.getBalance(account2));  
		}
		  
	}

	


