package copyObjects;

public class Main {

	public static void main(String[] args) {
		Car car1 = new Car("Skoda", "favorit", 1997);
		//Car car2 = new Car("Lada", "samara", 1994);
		Car car2 = new Car(car1);
		
		
	//	car2.setYear(car1.getYear());
		//car2.copy(car1);
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println();
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		System.out.println();
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());
		
	}
}
