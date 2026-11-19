package co.in.rays.overriding;

public class SBI extends Bank{
	
	@Override
	public String getBank() {
		
		// TODO Auto-genereted method stub
		return "SBI";
	}	
	
	public int interestRate() {
		
		return 7;
	}

}
