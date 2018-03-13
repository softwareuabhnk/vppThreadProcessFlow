
public class NumbersTask implements Runnable {

	private void longRunningMethod() throws InterruptedException {
		
		System.out.println("Starting long method");
		Double j = 1.01;
		for (long l = 1; l< 1000001; l++) {
			j+=1.01;
			if (Thread.interrupted()) throw new InterruptedException();
		}
		System.out.println("Ending long method");
	}
	
	@Override
	public void run() {
		for (int i = 0; i <= 1000; i++) {
			System.out.println("Task number " + Thread.currentThread().getName() + " is outputting " + i);
			try {
				longRunningMethod();
			} catch (InterruptedException e) {
				//Set interrupt flag back to set
				Thread.currentThread().interrupt();
			}
			if (Thread.interrupted()) break;
		}
		System.out.println("Task " + Thread.currentThread().getName() + " has finished");
	}

}
