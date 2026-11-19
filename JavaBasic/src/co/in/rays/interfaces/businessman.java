package co.in.rays.interfaces;

public class businessman extends Person implements Richman, SocialWorker {

	@Override
	public void earnMoney() {
		// TODO Auto-generated method stub
		System.out.println("earnMoney == 1 cr");
		
	}

	@Override
	public void donateMoney() {
		// TODO Auto-generated method stub
		System.out.println("donateMoney == 10 l");
		
	}

	@Override
	public void party() {
		// TODO Auto-generated method stub
		System.out.println("party ==  1 l");
		
	}
	
	@Override
	public void helptoother() {
		// TODO Auto-generated method stub
		System.out.println("helptoother == 10 l");
	}
	
	

}
