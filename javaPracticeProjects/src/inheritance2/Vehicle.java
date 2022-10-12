package inheritance2;

public class Vehicle {

	double speed;
	
	void go() {
		System.out.println("The "+this.getClass().getSimpleName()+" is moving");
		if(this.getClass().getSimpleName().equals("Car")) {
			speed = 80;
		} else {
			speed = 200;
		}
		System.out.println("With "+this.speed+"km/h");
	}
	
	void stop() {
		speed = 0;
		System.out.println("The "+this.getClass().getSimpleName()+" is stopped");
		System.out.println("Speed is : "+this.speed);
	}
}

