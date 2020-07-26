
public class CapitalizeTextFilter extends TextFilter {

	@Override
	public String transform(String input) {
		System.out.println("Entering capitalization filter...");
		Filter.sleep(1000);
		System.out.println("Capitalizing all words...");
		Filter.sleep(1000);
		
		String[] words = input.split("\\s+");
		String output = "";
		for (String word: words)
			output += word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
		
		Filter.printPiping();
		return output;
	}

}
