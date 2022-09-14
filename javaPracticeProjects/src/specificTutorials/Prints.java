package specificTutorials;

public class Prints {
	// printf() = an optional method to control, format, and display text to the console window
 	//			two arguments = format string + (object/variable/value)
	//			% [flags] [precision] [width] [conversion-character]
	
	public static void main(String[] args) {
		// %d display decimal number
		//System.out.printf("%d This is a format string", 123);
		
		
		boolean myBoolean = true;
		char myChar = '@';
		String myString = "Mathias";
		int myInt = 510;
		double myDouble = -6000;
		
		
		// [conversion-character]
		// 		display boolean
		System.out.printf("boolean value: %b",myBoolean);
		row();
		// 		display char
		System.out.printf("char: %c", myChar);
		row();
		// 		diisplay string 
		System.out.printf("string: %s",myString);
		row();
		// 		display int
		System.out.printf("int value: %d", myInt);
		row();
		// 		display double
		System.out.printf("double value: %f", myDouble);
		row();
		
		// [width]
		// 		minimum number of characters to be written as output
		System.out.printf("Hello %20s", myString);
		row();
		
		// [precision]
		// 		sets number of digits of precsion when outputting floating-point values
		System.out.printf("you have this much money %.2f", myDouble);
		row();
		
		// [flags] 
		// adds an effect to output based on the flag added to format specifier
		// - : left-justify;
		// + : output a plus ( + ) of minus ( - ) sign for a numeric value
		// 0 : numeric values are zero-padded
		// , : comma grouping separator if number > 1000
		System.out.printf("you have this much money %20f", myDouble);
		row();
		System.out.printf("you have this much money %+f", myDouble);
		row();
		System.out.printf("you have this much money %020f", myDouble);
		row();
		System.out.printf("you have this much money %,.2f", myDouble);
	}
	
	private static void row() {
		System.out.println();
	}

}
