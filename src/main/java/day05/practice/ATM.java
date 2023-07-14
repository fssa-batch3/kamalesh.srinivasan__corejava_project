package day05.practice;

public interface ATM {
	 boolean deposit(Account account, double amount);
	 boolean withdraw(Account account,double amount) throws Exception;
	 double getBalance(Account account);
}


class Account {
	
	public Account(String account,double balance) {
		this.accNo = account;
		this.balance = balance;
		
	}
	
	String accNo;
	
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	
	
	double balance;
	public double getBalance() {
	return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}


class AxisATM implements ATM {


	@Override
	public boolean deposit(Account account, double amount) {
		 account.setBalance(amount+account.balance);
		 return true;
	}

	@Override
	public boolean withdraw(Account account, double amount) throws Exception {
		
		double WTD = account.getBalance() - (amount + 5);

		if(WTD < 5000) {
			throw new Exception("Low balance");
		}
		else {
			double cuurentAmount = account.getBalance() - (amount + 5);
			account.setBalance(cuurentAmount);
			System.out.println("Withdraw successfull");
			System.out.println("Avaliable Balance : "+cuurentAmount);
			return true;
		}
				
	}

	@Override
	public double getBalance(Account account) {
		return account.balance;
	}
	
}


class IciciATM implements ATM {


	@Override
	public boolean deposit(Account account, double amount) {
		 account.setBalance(amount+account.balance);
		 return true;
	}

	@Override
	public boolean withdraw(Account account, double amount) throws Exception {
		
		double WTD = account.getBalance() - (amount + 10);

		if(WTD < 10000) {
			throw new Exception("Low balance");
		}
		else {
			double cuurentAmount = account.getBalance() - (amount + 5);
			account.setBalance(cuurentAmount);
			System.out.println("Withdraw successfull");
			System.out.println("Avaliable Balance : "+cuurentAmount);
			return true;
		}
				
	}

	@Override
	public double getBalance(Account account) {
		return account.balance;
	}
	
}

