package test;

import org.testng.annotations.Test;

public class x1_Basic {
	@Test
	public void Demo() 
	{
	System.out.println("hai");	
	}
	
	@Test(groups= {"Smoke"})
	public void Demo1()
	{
	System.out.println("hello");	
	
	}

}
