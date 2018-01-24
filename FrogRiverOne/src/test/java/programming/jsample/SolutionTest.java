package programming.jsample;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1Solution() {
		int earlistTime = solution.solution(5, new int[] { 1, 3, 1, 4, 2, 3, 5, 4 });
		Assert.assertEquals(6, earlistTime);
	}

	@Test
	public void test2Solution() {
		int earlistTime = solution.solution(5, new int[] { 1, 3, 1, 4, 2, 3, 4 });
		Assert.assertEquals(-1, earlistTime);
	}

}