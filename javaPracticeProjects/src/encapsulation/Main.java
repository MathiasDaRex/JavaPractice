package encapsulation;

public class Main {

	public static void main(String[] args) {
		// Encapsulation = 	attributes of a class will be hidden or private,
		//					Can be accessed only through methods (getters and setters).
		//					You should make attributes private if you don't have a reason
		//					to make them public or protected
		
		Car car = new Car("Ford", "Focus", 1999);
		car.setYear(2012);

		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
		
	}

}
