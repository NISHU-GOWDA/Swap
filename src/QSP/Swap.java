package QSP;

import org.testng.annotations.Test;

public class Swap {

	@Test
	public void demo1()
	{
		int a =10;
		int b = 20;
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println(a);
		System.out.println(b);
		
	}

}
