package programming.jsample;

public class Solution {

	public int solution(int[] a) {

		boolean[] intAvailable = new boolean[a.length];

		for (int i = 0; i < a.length; i++) {

			if (a[i] > 0 && a[i] <= intAvailable.length) {
				intAvailable[a[i] - 1] = true;
			}
		}
		int smallestPInt = 0;
		for (; smallestPInt < intAvailable.length; smallestPInt++) {
			if (!intAvailable[smallestPInt]) {
				break;
			}
		}
		return smallestPInt + 1;
	}
}