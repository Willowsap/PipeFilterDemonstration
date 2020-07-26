
public class ReverseWordsTextFilter extends TextFilter {

	@Override
	public String transform(String input) {
		System.out.println("Entering the word reversal filter...");
		Filter.sleep(1000);
		System.out.println("Reversing the letters in each word...");
		Filter.sleep(1000);
				
		String[] words = input.split("\\s+");
		String output = "";
		for (String word: words) {
			char[] chars = word.toCharArray();
			for (int i = chars.length - 1; i >= 0; i--)
				output += chars[i];
			output += " ";
		}
		
		Filter.printPiping();
		return output;
	}

}
