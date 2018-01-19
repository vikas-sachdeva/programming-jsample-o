package programming.jsample;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1Solution() {
		int missing = solution.solution(new int[] { 2, 3, 1, 5 });
		Assert.assertEquals(4, missing);
	}

	@Test
	public void test2Solution() {
		int missing = solution.solution(new int[] { 2 });
		Assert.assertEquals(1, missing);
	}

}