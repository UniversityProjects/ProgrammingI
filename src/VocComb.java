
/***********
Scrivere un programma che elenca su schermo tutte le possibili coppie di vocali
 tranne quelle doppie: si AE, no EE

Suggerimento: iterare sulle possibili vocali scandendo una
 stringa "aeiou" che le rende prelevabili ad una ad una
***********/

public class VocComb {

	public static void main (String[] args) {
	
		String voc = "aeiou";
		int i; // Conteggio Prima Vocale
		int j; // Conteggio Seconda Vocale
		String uno_pos = new String();
		String due_pos = new String();
		int length_string;
		
		length_string = voc.length();
				
		i = 0;
		
		do {
			
			j = 0;
			
			do {
				
				if ( i != j) {
					
					uno_pos = voc.substring(i,i+1);
					due_pos = voc.substring(j,j+1);
					System.out.println ( uno_pos + due_pos);
					
				}
				
				j++;
			
			} while (j < length_string );
		
			i++;
		
		} while (i < length_string);
		
	}
	
}
