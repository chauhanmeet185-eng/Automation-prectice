package selenium_code;

import org.testng.annotations.Test;

public class groupex2 {
	
	@Test(groups= {"smoke"})
	void show2()
	{
		System.out.println("in smoke2");
	}
	
	@Test(groups= {"retesting"})
	void display2()
	{
		System.out.println("in retesting2");
	}
	
	@Test(groups= {"smoke"})
	void test2()
	{
		System.out.println("in smoke2");
	}

}
