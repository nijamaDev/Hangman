package hangman;

import java.util.Scanner;

public class VistaConsola 
{
	private boolean perdedor, ganador;
	
	private int intentos;
	
	private ControlHangman hangman;
	
	private Scanner entradaEscaner;
	
	private String letra, pregunta;
	
	
	public VistaConsola()
	{
		
		entradaEscaner = new Scanner(System.in);
	}
	
	public void iniciarJuego()
	{
		hangman = new ControlHangman();
		intentos = 10;
		perdedor = false;
		ganador = false;
		System.out.println(
"                                 _\n" +
"				| |\n" +
"				| |__   __ _ _ __   __ _ _ __ ___   __ _ _ __  \n" +
"				| '_ \\ / _` | '_ \\ / _` | '_ ` _ \\ / _` | '_ \\ \n" +
"				| | | | (_| | | | | (_| | | | | | | (_| | | | |\n" +
"				|_| |_|\\__,_|_| |_|\\__, |_| |_| |_|\\__,_|_| |_|\n" +
"				                    __/ |                      \n" +
"				                   |___/");
		while (!perdedor && !ganador)
		{
			// hangman 
			// dibujo
			System.out.println("Digite una letra.");
			letra = entradaEscaner.nextLine();
			if (hangman.estaLaLetra(letra))
			{
				System.out.println("Correcto!\n" + hangman.reemplazar(letra));
				if (hangman.ganador())
				{
					ganador = true;
					System.out.println("¡¡Ganaste!!");
				}
			}
			else
			{
				intentos--;
				if (intentos < 1)
				{
					perdedor = true;
					System.out.println("Perdiste.");
				}
				else
					System.out.println("Te quedan " + intentos + " intentos.");
			}
		}
		seguirJugando();
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
