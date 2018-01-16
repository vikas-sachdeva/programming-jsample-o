package programming.jsample;

public class Solution {

	public int solution(int n) {

		int currentCount = 0;
		int binaryGap = 0;
		boolean initialDigit = false;
		while (n > 0) {
			int bit = n % 2;
			if (bit == 0) {
				currentCount++;
			} else if (initialDigit && binaryGap < currentCount) {
				binaryGap = currentCount;
				currentCount = 0;
			} else if (bit == 1) {
				initialDigit = true;
				currentCount = 0;
			}

			n = n / 2;
		}
		return binaryGap;
	}
}