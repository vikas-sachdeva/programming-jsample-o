package programming.jsample;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1Solution() {
		int smallestPInt = solution.solution(new int[] { 1, 3, 6, 4, 1, 2 });
		Assert.assertEquals(5, smallestPInt);
	}

	@Test
	public void test2Solution() {
		int smallestPInt = solution.solution(new int[] { 1, 2, 3 });
		Assert.assertEquals(4, smallestPInt);
	}

	@Test
	public void test3Solution() {
		int smallestPInt = solution.solution(new int[] { -1, -3 });
		Assert.assertEquals(1, smallestPInt);
	}

	@Test
	public void test4Solution() {
		int smallestPInt = solution.solution(new int[] { -1, -3, 4, 3 });
		Assert.assertEquals(1, smallestPInt);
	}

	@Test
	public void test5Solution() {
		int smallestPInt = solution.solution(new int[] { 1, 1, 2, 3, 4, 3 });
		Assert.assertEquals(5, smallestPInt);
	}

}