package programming.jsample;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1Solution() {
		int permutatedArray = solution.solution(new int[] { 4, 1, 3, 2 });
		Assert.assertEquals(1, permutatedArray);
	}

	@Test
	public void test2Solution() {
		int permutatedArray = solution.solution(new int[] { 4, 1, 3 });
		Assert.assertEquals(0, permutatedArray);
	}

}