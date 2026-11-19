package co.in.rays.overriding;

public class TestBank extends Bank {
	
	public static void main(String[] args) {
		
		//Bank b;
		
		//b = new SBI();
		//System.out.println(b.getBank());
		//System.out.println(b.interestRate());
		
		//b = new ICICI();
		//System.out.println(b.getBank());
		//System.out.println(b.interestRate());
		
		//b = new Axis();
		//System.out.println(b.getBank());
		//System.out.println(b.interestRate());
		
		Bank [] b = new Bank[3];
		b[0] = new SBI();
		b[1] = new ICICI();
		b[2] = new Axis();
		
		for(int i=0; i < b.length; i++) {
			System.out.println(b[i].getBank()+ " ======"+b[i].interestRate() );
		
		}
		
		
		
	}

}
