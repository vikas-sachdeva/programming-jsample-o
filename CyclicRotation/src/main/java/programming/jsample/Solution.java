package programming.jsample;

public class Solution {

	public int[] solution(int[] a, int k) {

		int b[] = new int[a.length];

		for (int i = 0; i < a.length; i++) {

			int newIndex = (i + k) % a.length;

			b[newIndex] = a[i];
		}
		return b;
	}
}