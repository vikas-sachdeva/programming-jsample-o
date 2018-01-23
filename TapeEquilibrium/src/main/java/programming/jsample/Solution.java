package programming.jsample;

public class Solution {

	public int solution(int[] a) {

		int totalSum = 0;
		for (int i = 0; i < a.length; i++) {
			totalSum += a[i];
		}
		int minDiff = Integer.MAX_VALUE;
		int firstPartSum = 0;
		for (int i = 0; i < a.length - 1; i++) {

			firstPartSum += a[i];
			int diff = totalSum > 2 * firstPartSum ? (totalSum - 2 * firstPartSum) : (2 * firstPartSum - totalSum);
			if (minDiff > diff) {
				minDiff = diff;
			}
		}
		return minDiff;
	}
}