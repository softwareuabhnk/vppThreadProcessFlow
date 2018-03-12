
public class NumbersTask implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
			try {
				int randomDelay = (int) (Math.random() * 500 + 1);
				Thread.sleep(randomDelay);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("Task " + Thread.currentThread().getName() + " has finished");
	}

}
