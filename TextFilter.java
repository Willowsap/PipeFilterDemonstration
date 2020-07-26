
public abstract class TextFilter implements Filter<String> {
	
	@Override
	public abstract String transform(String input);
}
