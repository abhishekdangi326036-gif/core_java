package co.in.rays.op;

public class TestAccount {
	
	public static void main (String [] args) {
		
		
		Account at = new Account();
		
		at.setNumber("123456789");
		at.setAccountType("Personal");
		at.setBalance(Double.parseDouble("20"));
		
		System.out.println(at.getNumber());
		System.out.println(at.getAccountType());
		System.out.println(at.getBalance());
		at.deposit(10000);
		at.withdrawal(20);
		
	}

}
