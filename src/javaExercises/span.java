package javaExercises;

public class span {

	public static void main(String[] args) {

		System.out.println(maxSpan(new int[] { 1, 2, 5, 6, 5, 4, 89, 1, 3, 3, 2, 3, 2 }));
		System.out.println(maxSpan(new int[] { 1, 2, 5, 6, 5 }));
		System.out.println(maxSpan(new int[] { 1, 2, 3, 4, 5 }));
		System.out.println(maxSpan(new int[] {}));
	}

	public static int maxSpan(int[] nums) {

		int result = 1;
		int c = 0;
		if (nums.length > 0) {
			for (int i = 0; i < nums.length; i++) {
				for (int j = nums.length - 1; j >= 0; j--) {
					if (nums[i] == nums[j]) {
						c = j - i + 1; // because of inclusive action add 1
						if (c > result) {
							result = c;
						}
					}

				}
			}
		} else {
			result = 0;
		}
		return result;
	}
}

