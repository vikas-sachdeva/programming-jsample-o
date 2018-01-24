package programming.jsample;

public class Solution {

	public int solution(int x, int[] a) {

		boolean[] leafAvailable = new boolean[x];
		int uniqueLeafCount = 0;
		int i = 0;
		for (; i < a.length; i++) {

			if (a[i] <= x && !leafAvailable[a[i] - 1]) {

				leafAvailable[a[i] - 1] = true;
				uniqueLeafCount++;
				if (uniqueLeafCount == x) {
					break;
				}
			}
		}
		return i == a.length ? -1 : i;

	}
}