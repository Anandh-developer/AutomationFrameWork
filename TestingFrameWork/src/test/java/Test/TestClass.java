package Test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Listeners.ListenersTestNG;


@Listeners(ListenersTestNG.class)
public class TestClass {
	
	@Test()
	public void test1()
	{
	
		Assert.fail("Test case failed");	
	}
	@Test()
	public void test2()
	{
	
	System.out.println("Test case passed");	
	
	}

}
