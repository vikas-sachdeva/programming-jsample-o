package programming.jsample;

public class Solution {

	public int solution(int[] a) {

		int permutatedArray = 0;

		for (int i = 0; i < a.length; i++) {
			permutatedArray ^= (i + 1) ^ a[i];
		}
		return permutatedArray != 0 ? 0 : 1;
	}
}