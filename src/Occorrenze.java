import java.util.Scanner;


/*****************
Si scriva un programma in Java che dopo aver chiesto in input all'utente 
una stringa e un carattere:
- conti il numero di occorrenze di tale carattere nella stringa 
- stampi a video se il carattere è presente oopure no nella frase. 
  Nel caso sia presente stampi il numero di volte che occorre nella frase

  Suggerimenti:
  Si faccia attenzione a verificare se la frase o il carattere da cercare siano vuoti
  Si faccia attenzione a non superare la lunghezza della frase
  
*****************/

public class Occorrenze {

	public static void main (String[] args) {
	
		int i = 0;
		int count = 0;
		char char_in;
		String string_in = new String();
		int length;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println ("Inserisci Una Stringa: ");
		string_in = kb.nextLine();
		
		System.out.println ("Inserisci Il Carattere Da Cercare: ");
		char_in = kb.nextLine().charAt(0);
		
		length = string_in.length();
		
		do {
		
			if ( string_in.charAt(i) == char_in ) {
			
				count++;
				
			}
			
			i++;		
		
		} while (i<length);
		
		System.out.println ("Il carattere " + char_in + " ripetuto " +  count);
		
	}
	
}