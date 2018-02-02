package programming.jsample;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1Solution() {
		int countDiv = solution.solution(6, 11, 2);
		Assert.assertEquals(3, countDiv);
	}

	@Test
	public void test2Solution() {
		int countDiv = solution.solution(0, 1, 11);
		Assert.assertEquals(1, countDiv);
	}

	@Test
	public void test3Solution() {
		int countDiv = solution.solution(10, 10, 5);
		Assert.assertEquals(1, countDiv);
	}

	@Test
	public void test4Solution() {
		int countDiv = solution.solution(11, 345, 17);
		Assert.assertEquals(20, countDiv);
	}

	@Test
	public void test5Solution() {
		int countDiv = solution.solution(18, 345, 17);
		Assert.assertEquals(19, countDiv);
	}

	@Test
	public void test6Solution() {
		int countDiv = solution.solution(11, 32, 11);
		Assert.assertEquals(2, countDiv);
	}

	@Test
	public void test7Solution() {
		int countDiv = solution.solution(1, 1, 11);
		Assert.assertEquals(0, countDiv);
	}

}