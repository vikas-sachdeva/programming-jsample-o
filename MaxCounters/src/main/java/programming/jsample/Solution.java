package programming.jsample;

public class Solution {

	public int[] solution(int n, int[] a) {

		int b[] = new int[n];
		int minCounter = 0;
		int maxCounter = 0;
		for (int i = 0; i < a.length; i++) {

			if (a[i] == n + 1) {
				minCounter = maxCounter;
			} else {
				if (b[a[i] - 1] < minCounter) {
					b[a[i] - 1] = minCounter;
				}
				b[a[i] - 1]++;
				if (maxCounter < b[a[i] - 1]) {
					maxCounter = b[a[i] - 1];
				}
			}
		}
		for (int i = 0; i < b.length; i++) {
			if (b[i] < minCounter) {
				b[i] = minCounter;
			}
		}
		return b;
	}
}