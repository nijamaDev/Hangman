package hangman;

public class ControlHangman 
{
	private String palabra,letra;
	
	private Words words;
	
	public ControlHangman()
	{
		words = new Words();
		palabra = words.escogerPalabra();
	}
}
