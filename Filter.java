import java.util.concurrent.TimeUnit;

public interface Filter<T> {
  public T transform(T input);
  public static void printPiping() {
    System.out.println("Piping output to next filter...");
		Filter.sleep(1000);
  }
  public static void sleep(int ms) {
    try {
			TimeUnit.MILLISECONDS.sleep(ms);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
  }
}
