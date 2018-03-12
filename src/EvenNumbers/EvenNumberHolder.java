package EvenNumbers;

public class EvenNumberHolder {
	private int currentEven = 0;

	public int getNextEven() {
		//public synchronized int getNextEven() {
		// More efficient is to just synchronize those lines which are critical
		// instead of synchronize the entire method
		synchronized (this) {
		currentEven = currentEven + 2;
		}
		return currentEven;
	}
}
