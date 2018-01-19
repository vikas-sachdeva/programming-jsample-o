package programming.jsample;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1Solution() {
		int steps = solution.solution(10, 85, 30);
		Assert.assertEquals(3, steps);
	}

	@Test
	public void test2Solution() {
		int steps = solution.solution(10, 10, 30);
		Assert.assertEquals(0, steps);
	}

	@Test
	public void test3Solution() {
		int steps = solution.solution(100000000, 1000000000, 100000000);
		Assert.assertEquals(9, steps);
	}

}