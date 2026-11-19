package co.in.rays.op;

public class TestOnlineExamination {
	
	public static void main (String [] args) {
		
		OnlineExamination oe = new OnlineExamination();
		
		oe.setExamId(123);
		oe.setSubject("5");
		oe.setTotalQuestion(15);
		oe.setDuration(60);
		oe.setTotalMarks(100);
		
		 System.out.println(oe. getExamId());
	        System.out.println(oe.getSubject());
	        System.out.println(oe.getTotalQuestion());
	        System.out.println(oe.getDuration());
	        System.out.println(oe.getTotalMarks());
	}

}
