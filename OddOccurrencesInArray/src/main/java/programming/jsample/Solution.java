package programming.jsample;

public class Solution {

	public int solution(int[] a) {

		int unpaired = 0;

		for (int i = 0; i < a.length; i++) {
			unpaired ^= a[i];
		}
		return unpaired;
	}
}