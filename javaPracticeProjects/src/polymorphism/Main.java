package polymorphism;

public class Main {

	public static void main(String[] args) {
		
		// polymorphism = 	greek word for poly-"many", morph-"form"
		//					the ability of an object to identify as more than one type
		
		Car car = new Car();
		Bicycle bike = new Bicycle();
		Boat boat = new Boat();
		
		// We need to use polymorphism to store the different data types in one array
		Vehicle[] racers = {car, bike, boat};
		
//		car.go();
//		bike.go();
//		boat.go();
		// That would work but there is a better way 
		for(Vehicle item : racers) {
			item.go();
		}
	}
	
// All objects: car, bike boat are in a children class of the vehicle,
// so if a go method is written in Vehicle, you can override it at all children class
	
}
