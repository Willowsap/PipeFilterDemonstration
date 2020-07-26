
public class PrintSink implements Sink<String>{

	@Override
	public void transform(String input) {
		System.out.println("Entering print sink filter...");
		Filter.sleep(500);
		System.out.println("Printing output...");
		Filter.sleep(1000);
		System.out.println(input);
	}
	
}
