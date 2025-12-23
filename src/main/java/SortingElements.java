import java.util.Arrays;
import java.util.Collections;

public class SortingElements {

	public static void main(String[] args) {


		Integer a[] = {50,20,40,10,100};

		System.out.println("Array elemets before sorting:" +Arrays.toString(a));

		Arrays.sort(a, Collections.reverseOrder());

		System.out.println("Array elements after sorting:" +Arrays.toString(a));

	}

}
