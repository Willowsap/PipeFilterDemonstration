import java.util.Scanner;

public class Tester {
	
	// filters used
	private static CapitalizeTextFilter capitalize = new CapitalizeTextFilter();
	private static ReverseWordsTextFilter reverseWords = new ReverseWordsTextFilter();
	private static ReverseSentenceTextFilter reverseSentence = new ReverseSentenceTextFilter();
	private static PrintSink print = new PrintSink();

	public static void main(String[] args) {
		
		
		
		System.out.println("Note: transformation process will be intentionally slowed down.");
		System.out.println("Input a sentence");
		
		Scanner input = new Scanner(System.in);
		String inputSentence = input.nextLine();
		input.close();
		
		transformSentence(inputSentence);
	}
	
	private static void transformSentence(String input) {
		print.transform(
			reverseSentence.transform(
				reverseWords.transform(
					capitalize.transform(input)
		)));
	}
}
