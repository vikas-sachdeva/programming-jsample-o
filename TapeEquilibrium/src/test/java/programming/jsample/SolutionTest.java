package programming.jsample;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1Solution() {
		int minDiff = solution.solution(new int[] { 3, 1, 2, 4, 3 });
		Assert.assertEquals(1, minDiff);
	}

	@Test
	public void test2Solution() {
		int minDiff = solution.solution(new int[] { 1000, 200, 8000 });
		Assert.assertEquals(6800, minDiff);
	}

	@Test
	public void test4Solution() {
		int minDiff = solution.solution(new int[] { 3, 3, 1 });
		Assert.assertEquals(1, minDiff);
	}

	@Test
	public void test5Solution() {
		int minDiff = solution.solution(new int[] { 7, 3, 4 });
		Assert.assertEquals(0, minDiff);
	}

	@Test
	public void test6Solution() {
		int minDiff = solution.solution(new int[] { -7, 2, 5, 4 });
		Assert.assertEquals(4, minDiff);
	}

	@Test
	public void test7Solution() {
		int minDiff = solution.solution(new int[] { -200, 4 });
		Assert.assertEquals(204, minDiff);
	}

}