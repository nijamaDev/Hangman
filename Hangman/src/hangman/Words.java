package hangman;

import java.util.Random;

public class Words 
{
	private String[] words = {"paraguas", "murcielago", "problemas",
			"etcetc"};
	public String escogerPalabra()
	{
		Random random = new Random();
		int tamañoWords = words.length;
		return words[random.nextInt(tamañoWords)];
	}
}
