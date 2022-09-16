package javaMethodChaining;

public class Main {

	public static void main(String[] args) {
	
		// method chaining = 	a common syntax for invoking multiple method calls in OOP
		//						condense code into less lines
		
		String name = "       LaJoS";
		
		// we can do it like this
//		name = name.concat(" codes");
//		name = name.toUpperCase();
//		name = name.trim();
		
		// and like this 
		name = name.concat(" codez     ").toUpperCase().trim().toLowerCase();
		
		
		System.out.println(name);
	}
}
