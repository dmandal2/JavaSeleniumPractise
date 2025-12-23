
public class ComputerTeacher extends Teacher {

	public static void main(String[] args) {

		Teacher ct = new Teacher();

		System.out.println("Destination: " + ct.designation);
		System.out.println("College: " + ct.collegeName);
		ct.does();

	}

}
