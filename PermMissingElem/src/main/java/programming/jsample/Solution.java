package programming.jsample;

public class Solution {

	public int solution(int[] a) {

		int missingElement = 0;
		for (int i = 0; i < a.length; i++) {
			missingElement ^= (i + 1) ^ a[i];
		}
		return missingElement ^ a.length + 1;
	}
}