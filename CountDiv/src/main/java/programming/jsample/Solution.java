package programming.jsample;

public class Solution {

	public int solution(int a, int b, int k) {

		int betweenCountDiv = b / k - a / k;

		int borderCountDiv = a % k == 0 ? 1 : 0;

		return betweenCountDiv + borderCountDiv;

	}
}