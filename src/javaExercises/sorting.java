package javaExercises;
import java.util.Arrays;
public class sorting {

	public static void main(String[] args) {
		int c[] = { 0, 100, 1, 5, 9, 8, 4, 3, 1, 9, 5, 89, 3, -9 };
		test2(c);
	}

	public static void test(int x[]) {
		for (int i = 0; i < x.length; i++) {
			int temp = 0;
			for (int j = i + 1; j < x.length; j++) {
				if (x[j] > x[i]) { // swapping numbers and put large number to
									// the beginning
					temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		}
		// printing sorted array
		for (int i : x) {
			System.out.print(i + "   ");
		}
	}

	public static void test2(int arr[]) {

		String result = "";
		Arrays.sort(arr); // it sorts ascending order , if you want to do
							// descending you need to do something different
		for (int i : arr) {
			// System.out.print(i + " ");
			result = i + "  " + result + "   ";
		}
		System.out.print("\n\r " + result);
	}

}
