
public class MissingNumbersInArray {

	public static void main(String[] args) {

		// Array should not have duplicates
		// Array no need to be sorted
		// Values should be in range

		int a[] = { 1, 4, 5, 3 };

		// 1+4+5+3=13 sum1
		// 1+2+4+5+3=15 sum2
		// sum2-sum1= 15-13=2 missing

		int sum1 = 0;
		for (int element : a) {
			sum1 = sum1 + element;
		}

		System.out.println("Sum of lements in array:" + sum1);

		int sum2 = 0;
		for (int i = 1; i <= 5; i++) {
			sum2 = sum2 + i;
		}

		System.out.println("sum of range of elements in array:" + sum2);

		System.out.println("missing number in array:" + (sum2 - sum1));
	}

}
