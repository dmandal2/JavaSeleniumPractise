
public class Calculation1 {

	int sum(int x, int y) {
		return (x + y);
	}

	int sum(int x, int y, int z) {
		return (x + y + z);
	}

	double sum(double x, double y) {
		return (x + y);
	}

	double sum(double x, double y, double z) {
		return (x + y + z);
	}

	public static void main(String[] args) {

		Calculation1 cal = new Calculation1();
		System.out.println("Sum of 2 integers: " + cal.sum(10, 10));
		System.out.println("Sum of 3 integers: " + cal.sum(20, 30, 40));
		System.out.println("Sum of 2 doubles: " + cal.sum(20.5, 30.7));
		System.out.println("Sum of 3 doubles: " + cal.sum(15.45, 23.1, 87.5));
	}

}
