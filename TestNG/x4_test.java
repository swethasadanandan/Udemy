package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class x4_test {
	
	@Test
	public void Fruit()
	{
		System.out.println("Mango");	

	}
	@Test(enabled=false)
	public void Breey() {
		System.out.println("Banana");	

	}
	@Parameters({"ABC", "KEY"})
	@Test
	public void Jack(String name,String vname) {
		System.out.println("Water Melon");
		System.out.println(name);
		System.out.println(vname);


	}
	@Test(dependsOnMethods="Jack")
	public void Bat() {
		System.out.println("Cherry");	

	}
	

}
