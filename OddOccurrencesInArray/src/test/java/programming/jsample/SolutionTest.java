package programming.jsample;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1Solution() {
		int unpaired = solution.solution(new int[] { 9, 3, 9, 3, 9, 7, 9 });
		Assert.assertEquals(7, unpaired);
	}

	@Test
	public void test2Solution() {
		int unpaired = solution.solution(new int[] { 9 });
		Assert.assertEquals(9, unpaired);
	}

	@Test
	public void test3Solution() {
		int unpaired = solution.solution(new int[] { 100000000, 900090090, 1000000000, 900090090, 100000000 });
		Assert.assertEquals(1000000000, unpaired);
	}
}