package LeetCode;

public class findCoinsWays {

	public static void main(String[] args) {
		System.out.println(count2(new int[] { 3, 1, 5 }, 11));

	}

	public static int count(int[] coins, int amount) {

		int[] a = new int[amount + 1];
		a[0] = 1;
		for (int i : coins) {
			for (int j = 1; j < a.length; j++) {
				if (j >= i) {
					a[j] += a[j - i];
				}
			}
		}

		return a[amount];
	}

	public static int count2(int[] c, int n) {

		int[] a = new int[n + 1];
		a[0] = 1;

		for (int i : c) {
			for (int j = 1; j < n + 1; j++) {
				if (j >= i) {
					a[j] = a[j] + a[j - i];
				}
			}
		}
		return a[n];
	}
}
