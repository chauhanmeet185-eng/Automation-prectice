package selenium_code;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterex {
	
	@Parameters({"c","d"})
	@Test
	void show(int a, int b)
	{
		System.out.println("a = "+a+" b = "+b);
	}

}
