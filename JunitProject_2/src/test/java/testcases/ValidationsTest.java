package testcases;

import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.Assert;
import org.junit.Rule;



public class ValidationsTest {

	@Rule
	public ErrorCollector errcol = new ErrorCollector();
	
	
	@Test
	public void validate() {
		
		String expectedValue = "Jerald";
		String actualValue = "Jerald AJ";
		System.out.println("Start");
		try {
		Assert.assertEquals(expectedValue, actualValue);
		} catch (Throwable e) {
			System.out.println("some error "+e.getMessage());
			errcol.addError(e);
		}
		
		try {
		Assert.assertTrue("Error Message", 14>12);
		} catch (Throwable e) {
			System.out.println("Another error "+e.getMessage());
			errcol.addError(e);
		}
		System.out.println("End");
	}
}
