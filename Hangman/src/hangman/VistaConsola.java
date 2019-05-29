package hangman;

import java.util.Scanner;

public class VistaConsola 
{
	private ControlHangman hangman;
	
	private Scanner entradaEscaner;
	
	private String letra, pregunta;
	
	
	public VistaConsola()
	{
		hangman = new ControlHangman();
		entradaEscaner = new Scanner(System.in);
	}
	
	public void iniciarJuego()
	{
		System.out.println("Bienvenido a Hangman.");
		// hangman 
		// dibujo
		// rayitas
		System.out.println("Digite una letra.");
		letra = entradaEscaner.nextLine();
	}
	
	public void seguirJugando()
	{
		System.out.println("¿Jugar nuevamente? y/n");
		pregunta = entradaEscaner.nextLine();
		if (pregunta.equals ("y"))
		{
			iniciarJuego();
		}
		else
		{
			System.out.println("Has salido.");
		}
	}
}
