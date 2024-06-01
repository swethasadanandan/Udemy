package first;

import java.util.ArrayList;


import org.testng.annotations.Test;

public class z3_Java_Stream {
	
	@Test
	public void regular()
	{
	
	ArrayList<String> names =new ArrayList<String>();
	names.add("Amal");
	names.add("Roshi");
	names.add("Arch");
	names.add("jaan");
	
	Long c =names.stream().filter(s->s.startsWith("A")).count();
	System.out.println(c);
	names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	
	}

}
