package specificTutorials;

public class Overload {

	public static void main(String[] args) {
		// Overloaded methods = methods that have the same name but recive different parameters
		// method name + parameters = method signature
		int x = add(1, 3);
		System.out.println(x);
		int y = add(1, 2, 3);
		System.out.println(y);
		int u = add(3, 5, 3, 6);
		System.out.println(u);
		Double z = add(5.8, 6.7);
		System.out.println(z);
		Double e = add(3.4, 5.3, 5.2);
		System.out.println(e);
		Double v = add(12.3, 51.01, 12.34, 123.1);
		System.out.println(v);
		
	}
	
	static int add(int a, int b) {
		System.out.println("This is overloaded method 1");
		return a + b;
	}
	static int add(int a, int b, int c) {
		System.out.println("This is overloaded method 2");
		return a + b + c;
	}
	static int add(int a, int b, int c, int d) {
		System.out.println("This is overloaded method 3");
		return a + b + c + d;
	}
	static double add(Double a, Double b) {
		System.out.println("This is overloaded method 4");
		return a + b;
	}
	static double add(Double a, Double b, Double c) {
		System.out.println("This is overloaded method 5");
		return a + b + c;
	}
	static double add(Double a, Double b, Double c, Double d) {
		System.out.println("This is overloaded method 6");
		return a + b + c + d;
	}

}
