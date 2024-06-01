package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class x3_test {
	
	@Test
	public void Car()
	{
		System.out.println("Jeep");	

	}
	@Test
	public void Bus() {
		System.out.println("Lorry");	

	}
	@AfterTest
	public void Testing()
	{
		System.out.println("Exceute last");	
	
	}
	
	@BeforeMethod
	public void Run()
	{
		System.out.println("Will display before every method ");	

	}
	
	@AfterMethod
	public void Runn()
	{
		System.out.println("-------Will display after method ");	

	}

}
