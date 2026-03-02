package selenium_code;

import org.testng.annotations.Test;

public class attributesdemo {
	
	@Test(description = "This test case is for login with valid credentails",priority=1)
	void login()
	{
		System.out.println("in login");
	}
	
	@Test(timeOut=200,priority=-2)
	void show() throws InterruptedException
	{
		System.out.println("in show");
		
	}
	
	@Test(dependsOnMethods = {"login"})
	void home()
	{
		System.out.println("in home");
	}
	
	@Test
	void test()
	{
		System.out.println("in test");
	}


}
