package accessPackage2;

import accessPackage1.*;

public class Asub extends A{
	
	// Access modifiers adds a layer of security to our code
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Asub sub = new Asub();
		System.out.println(sub.protectedMessage);

	}
	
}
