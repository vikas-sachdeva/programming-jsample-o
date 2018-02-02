package programming.jsample;

public class Solution {

	public int solution(int[] a) {

		int passingCars = 0;
		int eastCount = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				eastCount++;
			} else {
				passingCars += eastCount;
				if (passingCars > 1000000000) {
					passingCars = -1;
					break;
				}
			}
		}
		return passingCars;
	}
}