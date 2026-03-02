package selenium_code;

import org.testng.annotations.Test;

public class test {
	
	@Test
	void show()
	{
		System.out.println("in show");
	}

	@Test(enabled=false)
	void display()
	{
		System.out.println("in display");
	}

}
