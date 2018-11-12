/**
 * 
 */
package amyhoo.github.com.numberGame;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

/**
 * @author 1218002X5
 *
 */
public class AppTest {

	@Test
	public void testStage1() {
		App instance = new App();
		String[] result = new String[] { "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz",
				"13", "14", "FizzBuzz" };
		List<String> data = instance.stage1(15);
		for (int i = 0; i < 15; i++) {
			Assert.assertEquals(result[i], data.get(i));
		}
	}

	@Test
	public void testStage2() {
		App instance = new App();
		String[] result = new String[] { "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz",
				"Fizz", "14", "FizzBuzz" };
		List<String> data = instance.stage2(15);
		for (int i = 0; i < 15; i++) {
			Assert.assertEquals(result[i], data.get(i));
		}
	}

}
