package programming.jsample;

public class Solution {

	public int solution(int x, int y, int d) {

		int diff = y - x;
		int lessOrEqualSteps = diff / d;
		int extraStep = diff % d > 0 ? 1 : 0;
		int totalSteps = lessOrEqualSteps + extraStep;
		return totalSteps;
	}
}