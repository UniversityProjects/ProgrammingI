/****************
  Scrivere un metodo inverti che prende come parametro una stringa
  e ritorna al chiamante una stringa che ha i caratteri invertiti rispetto
  alla stringa originale. Ad es. alex --> xela 

Suggerimenti:
- Si ricorda che per ora definiamo solo metodi 'static' che possono 
essere chiamati molto semplicemente dal (metodo) main di una classe.
- Per provare il metodo si definisca appunto una classe e un metodo main
  appropriato che:
  1) chieda all'utente una stringa
  2) chiami il metodo inverti
  3) stampi a video la stringa invertita
 
  **********/
  
import java.util.Scanner;
import java.lang.String;

public class InvertiStringa {

	public static void main (String[] args) {
	
		String input_string = new String(); // Stringa Input Utente
		String output_string = new String(); // Output Stringa Invertita
		
		Scanner kb = new Scanner (System.in); // Tastiera
		
		System.out.println ("Inserisci Una Stringa Di Cui Restituirò L'Inverso: ");
		input_string = kb.nextLine();
		
		output_string = inverse_string(input_string);

		System.out.println (input_string + "  --->  " + output_string);
	
	}
	
	public static String inverse_string (String str) {
	
		String str_return = new String();
		
		for (int i = str.length()-1; i>=0; i--) {
		
			str_return += str.charAt(i);
			
		}
		
		return str_return;
	
	}
	
}