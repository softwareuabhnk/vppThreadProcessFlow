package EvenNumbers;

public class Generator {

	public static void main(String[] args) {
		System.out.println("Starting thread " + Thread.currentThread().getName());
		
		
		EvenNumberHolder evenNumberHolder = new EvenNumberHolder();
		EvenTask task = new EvenTask(evenNumberHolder);
		
		for (int i = 0; i<=15; i++) {
			Thread evenTaskThread = new Thread(task);
			evenTaskThread.start();
			
		}

	}

}
