
public class ReverseSentenceTextFilter extends TextFilter {

	@Override
	public String transform(String input) {
		System.out.println("Entering sentence reversal filter...");
		Filter.sleep(1000);
		System.out.println("Reversing the words in the sentence...");
		Filter.sleep(1000);
				
		String[] words = input.split("\\s+");
		String output = "";
		for (int i = words.length - 1; i >= 0; i--)
			output += words[i] + " ";
		
      Filter.printPiping();
		return output;
	}

}
