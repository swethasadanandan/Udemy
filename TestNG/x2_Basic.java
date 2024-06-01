package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class x2_Basic {
	
	
	@Parameters({"URL"})
	@Test(groups= {"Smoke"})
	public void Car(String urlname)
	{
		System.out.println("BMW");	
		System.out.println(urlname);

	}
	
	@Test
	public void Bus() {
		System.out.println("Audi");
	
		

	}
	@BeforeTest
	public void Test()
	{
		System.out.println("First Execute");	

	}
	
	@BeforeSuite
	public void Check()
	{
		System.out.println("1 will be first");	

	}
	
	@AfterSuite
	public void Checking()
	{
		System.out.println("1 will be last one");	

	}

}
