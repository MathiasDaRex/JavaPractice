package multiThreading;

public class Multithreading {
	
	// Multithreading is the ability to execute multiple different paths of code at the same time

	public static void main(String[] args) {
		
		
		for(int i = 1; i <= 5; i++) {
			MultithreadThing myThing = new MultithreadThing(i);
			Thread myThread = new Thread(myThing);
			myThread.start();
			try {
				// if you want to wait for a specific thread to finish it's job, you can use join
				myThread.join();
				myThread.isAlive();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	//	MultithreadThing myThing2 = new MultithreadThing();
		
	// not gonna run multithreaded	
	//	myThing.run();
	//	myThing2.run();
	
	// start is for multithreading
	//	myThing.start();
	//	myThing2.start();
		
	}
}
