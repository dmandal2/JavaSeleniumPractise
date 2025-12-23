public class Student {

	int sid;
	String Sname;
	int Sub1;
	int Sub2;
	int Sub3;

	// Method to get student ID and name
	void getStuData(int id, String name) {
		sid = id;
		Sname = name;
	}

	// Method to get student marks
	void getStuMarks(int mark1, int mark2, int mark3) {
		Sub1 = mark1;
		Sub2 = mark2;
		Sub3 = mark3;
	}

	// Method to calculate and print total marks
	void totalMarks() {
		int totalmrks = Sub1 + Sub2 + Sub3;
		System.out.println("Student ID: " + sid);
		System.out.println("Student Name: " + Sname);
		System.out.println("Total Marks: " + totalmrks);
	}

	// main method to create student objects and call methods
	public static void main(String[] args) {
		Student stu1 = new Student();
		Student stu2 = new Student();

		// Set data for stu1
		stu1.getStuData(101, "John");
		stu1.getStuMarks(80, 85, 90);
		stu1.totalMarks();

		System.out.println(); // just for spacing

		// Set data for stu2
		stu2.getStuData(102, "Alice");
		stu2.getStuMarks(70, 75, 80);
		stu2.totalMarks();
	}
}
