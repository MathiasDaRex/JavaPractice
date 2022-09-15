package multiThreading;

// Maybe implementing the runabble interface is better, because if you extend Thread, you cannot extend any other class here
public class MultithreadThing extends Thread implements Runnable{

	private int threadNumber;
	public MultithreadThing(int threadNumber) {
		this.threadNumber = threadNumber;
	}
	
	@Override
	public void run() {
		for(int i = 1; i<=5; i++) {
			System.out.println(i + " from thread "+ threadNumber);
			
//			if any of the threads fail working, it doesn't effect the other threads at all.
//			if(threadNumber == 3) {
//				throw new RuntimeException();
//			}
			
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
