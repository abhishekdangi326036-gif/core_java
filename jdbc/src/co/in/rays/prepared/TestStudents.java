package co.in.rays.prepared;

public class TestStudents {

	public static void main(String[] args) {

		try {
			testAdd();
		} catch (Exception e) {

			e.printStackTrace();

		}
	}

	public static void testAdd() throws Exception {

		Students student = new Students();
		StudentsBean bean = new StudentsBean();

		bean.setStudentId(5);
		bean.setName("ak");
		bean.setEmail("ak@gmail.com");
		bean.setAge(21);
		bean.setCourse("phy");

		student.add(bean);

	}

}
