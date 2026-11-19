package co.in.rays.op;

public class Account {

	private String number;
	private String accountType;
	private double balance;

	public void setNumber(String number) {
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setAccountType(String accounttype) {
		this.accountType = accounttype;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
		
	}

	public Double getBalance() {
		return balance;
	}

	public void deposit(int amount) {
		balance = amount + balance;
		System.out.println("Current bal after deposite " + balance);

	}
	
	public void withdrawal(int amount) {
		balance = balance - amount ;
		System.out.println("Current bal after withdrawal " + balance);

	}

}
