public class Main {

	public static void main(String[] args) {
		System.out.println("Starting");
		NumbersTask task = new NumbersTask();

		Thread numbersThread0 = new Thread(task);
		numbersThread0.start();

		Thread numbersThread1 = new Thread(task);
		numbersThread1.start();

		try {
			Thread.sleep(900);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
		// numbersThread0.interrupt();
		// numbersThread1.interrupt();

		try {
			numbersThread0.join();
			numbersThread1.join();
		} catch (InterruptedException e) {
			//Do nothing
		}

		System.out.println("Thread " + Thread.currentThread().getName() + " is Finished");

	}

}
