/**********************
(N.B. Qui l'argomento al metodo e' di tipo String, non di tipo primitivo)
Scrivere un programma Java che chiede all'utente una stringa
e poi la visualizza all'interno di una cornice di asterischi:
         *******
pippo -> *pippo*
         *******
Si produca la visualizzazione in un metodo (invocato dal main)
'void' che riceve come argomento la stringa
e che stampa la stringa circondata dalla giusta
quantita' di asterischi (in base alla lunghezza della stringa).
**********************/

import java.util.Scanner;
import java.lang.String;

public class MetodoStampaInCornice {

	public static void main (String[] args) {
	
		String string = new String();
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println ("Inserisci Una Stringa: ");
		string = kb.nextLine();
		
		PrintCornice(string);	
	
	}
	
	public static void PrintCornice (String str) {
	
		int length = str.length();
		
		System.out.println ("");
		
		for (int i=0; i<length+2; i++) {
		
			System.out.print ("*");
			
		}
		
		System.out.println ("");
		
		System.out.println ("*" + str + "*");
		
		for (int i=0; i<length+2; i++) {
		
			System.out.print ("*");
			
		}
		
	}
	
}