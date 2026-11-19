package co.rays.preparedstatement;

import java.text.SimpleDateFormat;

public class TestUserModel {
	
	public static void main(String[] args)  {
		
		try {
			testAdd();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void testAdd() throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		UserModel model = new UserModel();
		model.add(1, "John", "Doe", "johndoe", "password123", sdf.parse("1990-01-01"));
	}

}
