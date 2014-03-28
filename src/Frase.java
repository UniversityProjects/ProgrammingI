import java.util.*;

/* Si scriva un programma in Java che, utilizzando
   gli appropriati metodi sulle stringhe:
   - chieda all'utente una frase e
   - se la frase contiene 2 o piu' parole:
   		- stampi a video che la frase contiene due parole o piu'
   		- stampi a video la prima parola e la sua lunghezza
		- stampi a video l'ultima parola della frase e la sua lunghezza
   - se la frase contiene una parola:
   		- stampi a video che la frase contiene una sola parola
   		- stampi a video la parola e la sua lunghezza
   - se la frase inserita e' vuota:
   		- stampi a video che la frase non contiene parole.

  Si tenga conto, e si gestisca in modo appropriato, l'inserimento
  da parte dell'utente di spazi o tab all'inizio e alla fine della frase.

  Si ricorda che e' vietato l'uso dei cicli!

  AIUTO/Semplificazione: 
  La frase non contiene caratteri di punteggiatura o tab; 
  percio' le parole sono individuabili semplicemente 'ricercando' lo spazio.
  
  ***********/
  
public class Frase {

	public static void main (String[] args) {
	
		String stringa_in = new String();
		int length; // LUnghezza Stringa
		int i = 0; // Variabile Di Appoggio
		char charact;
		int space_num = 0; // Numero Spazi
		
		Scanner kb = new Scanner (System.in);
		
		System.out.println ("Inserisci Una Frase: ");
		stringa_in = kb.nextLine();
		
		length = stringa_in.length();
		
		// Ciclo Calcolo Spazi
		do {
		
			charact = stringa_in.charAt(i);
			
			if ( charact == ' ') {
			
				space_num++;
				
			}		
		
		} while (i<length);
		
		if ( space_num == 0) {
		
			System.out.println ("La Frase E' Vuota");
			
		}
		
		if ( space_num == 1) {
		
			System.out.println ("La Frase Contiene Una Parola: " + stringa_in + " di lunghezza " + length);
			
		}
		
		if ( space_num > 1) {
		
			System.out.println ("La Frase E' Di " + length + " parole:");
			
			System.out.println ("La Frase E' Di " + length + " parole:");
			
		}
		
	
	}
	
}