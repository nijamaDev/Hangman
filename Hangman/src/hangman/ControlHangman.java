package hangman;

public class ControlHangman 
{
	private String palabra;
	
	private char[] palabraEncontrada;
	
	private int largoPalabra;
	
	private Words words;
	
	public ControlHangman()
	{
		words = new Words();
		palabra = words.escogerPalabra();  //Escoje una palabra de la base de datos.
		largoPalabra = palabra.length();
		
		palabraEncontrada = "_".repeat(largoPalabra).toString().toCharArray();
	}
	
	public boolean estaLaLetra(String letra) //busca si está la letra en la palabra a adivinar y devuelve true o false.
	{
		if (palabra.indexOf(letra) >= 0)
			return true;
		else
			return false;
	}
	
	public String reemplazar(String letra) // Reemplaza la letra en todas las posiciones de la palabra
	{
		char letraChar = letra.charAt(0);
		for (int i = 0; i < largoPalabra; i++)
		{
			if (palabra.charAt(i) == letraChar)
			{
				palabraEncontrada[i] = letraChar;
			}
		}
		return String.valueOf(palabraEncontrada);
	}
	
	public boolean ganador()
	{
		if (String.valueOf(palabraEncontrada).equals(palabra))
			return true;
		else
			return false;
	}
				
}
