package co.in.rays.prepared;

public class TestMarksheet {

	public static void main(String[] args) {

		try {
			//testAdd();
			//testdelete();
			testupdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void testAdd() throws Exception {

		Marksheet marksheet = new Marksheet();
		UserBean bean = new UserBean();

		bean.setId(5);
		bean.setRoll_no(105);
		bean.setName("chintu");
		bean.setPhy(67);
		bean.setChe(67);
		bean.setMath(67);
		
		marksheet.add(bean);
		

	}
	
	public static void testdelete() throws Exception {
		
		Marksheet marksheet = new Marksheet();
		
		
		marksheet.delete(1);
		
	}
	
	public static void testupdate() throws Exception {
		
		Marksheet marksheet = new Marksheet();
		UserBean bean = new UserBean();
		
		bean.setId(5);
		bean.setRoll_no(105);
		bean.setName("chintu");
		bean.setPhy(67);
		bean.setChe(68);
		bean.setMath(66);
		
		marksheet.update(bean);
		
		
	}
	
	

}
