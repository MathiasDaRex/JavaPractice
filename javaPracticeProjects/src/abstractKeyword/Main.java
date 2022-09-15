package abstractKeyword;

public class Main {

	public static void main(String[] args) {
		// abstract = 	abstract classes cannot be instantiated, but they can have a subclass
		//				abstract methods are declared without an implementation
		//				but these methods MUST be overrided in the subclass.
		// adds a layer of security
		
		// Vehicle vehicle = new Vehicle();
		Car car = new Car();
		car.go();
		

	}

}
