package programming.jsample;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1Solution() {
		int[] counterArray = solution.solution(5, new int[] { 3, 4, 4, 6, 1, 4, 4 });
		Assert.assertArrayEquals(new int[] { 3, 2, 2, 4, 2 }, counterArray);
	}

	@Test
	public void test2Solution() {
		int[] counterArray = solution.solution(4, new int[] { 2, 2, 5, 3, 2, 5, 1 });
		Assert.assertArrayEquals(new int[] { 4, 3, 3, 3 }, counterArray);
	}

	@Test
	public void test3Solution() {
		int[] counterArray = solution.solution(2, new int[] { 1, 2, 3 });
		Assert.assertArrayEquals(new int[] { 1, 1 }, counterArray);
	}

	@Test
	public void test4Solution() {
		int[] counterArray = solution.solution(2, new int[] { 1, 1, 3, 2, 2 });
		Assert.assertArrayEquals(new int[] { 2, 4 }, counterArray);
	}

	@Test
	public void test5Solution() {
		int[] counterArray = solution.solution(2, new int[] { 1, 1, 3, 3, 2, 3, 3, 1, 3, 3, 2 });
		Assert.assertArrayEquals(new int[] { 4, 5 }, counterArray);
	}
}