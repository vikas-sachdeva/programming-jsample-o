package programming.jsample;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void solutionTest1() {
		int binaryGap = solution.solution(9);
		Assert.assertEquals(2, binaryGap);
	}

	@Test
	public void solutionTest2() {
		int binaryGap = solution.solution(529);
		Assert.assertEquals(4, binaryGap);
	}

	@Test
	public void solutionTest3() {
		int binaryGap = solution.solution(20);
		Assert.assertEquals(1, binaryGap);
	}

	@Test
	public void solutionTest4() {
		int binaryGap = solution.solution(15);
		Assert.assertEquals(0, binaryGap);
	}

	@Test
	public void solutionTest5() {
		int binaryGap = solution.solution(1041);
		Assert.assertEquals(5, binaryGap);
	}
	
	@Test
	public void solutionTest6() {
		int binaryGap = solution.solution(1);
		Assert.assertEquals(0, binaryGap);
	}
}