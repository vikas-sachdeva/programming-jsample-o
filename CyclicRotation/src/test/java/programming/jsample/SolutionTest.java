package programming.jsample;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1Solution() {
		int[] rotated = solution.solution(new int[] { 3, 8, 9, 7, 6 }, 3);
		Assert.assertArrayEquals(new int[] { 9, 7, 6, 3, 8 }, rotated);
	}

	@Test
	public void test2Solution() {
		int[] rotated = solution.solution(new int[] { 0, 0, 0 }, 3);
		Assert.assertArrayEquals(new int[] { 0, 0, 0 }, rotated);
	}

	@Test
	public void test3Solution() {
		int[] rotated = solution.solution(new int[] { 1, 2, 3, 4 }, 4);
		Assert.assertArrayEquals(new int[] { 1, 2, 3, 4 }, rotated);
	}
}