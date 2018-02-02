package programming.jsample;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1Solution() {
		int passingCars = solution.solution(new int[] { 0, 1, 0, 1, 1 });
		Assert.assertEquals(5, passingCars);
	}

	@Test
	public void test2Solution() {
		int passingCars = solution.solution(new int[] { 0, 1, 0, 1, 0 });
		Assert.assertEquals(3, passingCars);
	}

	@Test
	public void test3Solution() {
		int passingCars = solution.solution(new int[] { 1, 1, 1, 1, 0 });
		Assert.assertEquals(0, passingCars);
	}

	@Test
	public void test4Solution() {
		int passingCars = solution.solution(new int[] { 0, 1, 0, 1, 0, 0, 0, 1 });
		Assert.assertEquals(8, passingCars);
	}
}