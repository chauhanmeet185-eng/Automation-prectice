package selenium_code;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertex {
	
	@Test
	void verification()
	{
		Boolean b = false;
		//Assert.assertTrue(b);
		//Assert.assertFalse(b);
		
		String actual = "hii";
		String expected = "hello";
		String s = null;
		
		//Assert.assertEquals(actual, expected);
		//Assert.assertNotEquals(actual, expected);
		//Assert.assertNull(s);
		Assert.assertNotNull(s);
		
		
		System.out.println("Test Pass");
	}

}
