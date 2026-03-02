package selenium_code;

import org.testng.annotations.Test;

public class groupex {

	@Test(groups= {"smoke"})
	void show()
	{
		System.out.println("in smoke");
	}
	
	@Test(groups= {"retesting","smoke"})
	void display()
	{
		System.out.println("in retesting & in smoke testing");
	}
	
	@Test(groups= {"regression"})
	void test()
	{
		System.out.println("in regression");
	}
	
}
