
public class B implements A {

	@Override
	public void sum() {
		System.out.println("Sum of a and b: " + (a + b));
	}

	public static void main(String[] args) {

		// B obj = new B(); //object creation of B but we can use below one for
		// interface recommended

		A obj = new B(); // interface reference

		obj.sum();

		System.out.println("Accessing a of interface: " + A.a);
		System.out.println("Accessing b of interface: " + A.b);

	}

}
