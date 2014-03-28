import java.util.Scanner;


/* 

   Scrivere un programma in Java che, dopo aver chiesto una
   frase/parola all'utente, conti le vocali contenute 
   nella frase/parola digitata dall'utente
   
 */
 
public class ContaVocali {
 
	public static void main (String[] args) {
	
		String string_in = new String();
		int count_voc = 0;
		int i = 0;
		char char_tmp;
		int length_string = 0;
		Scanner kb = new Scanner (System.in);
		
		System.out.println ("Inserisci Una Stringa: ");
		string_in = kb.nextLine();
		
		length_string = string_in.length();
		
		do {
		
			char_tmp = string_in.charAt(i);
			
			if ( char_tmp == 'a' || char_tmp == 'e' || char_tmp == 'i' || char_tmp == 'o' || char_tmp == 'u' ) {
			
				count_voc++;
				
			}		
			
			i++;
		
		} while (i<length_string);
		
		System.out.println ("\nNumero Vocali: " + count_voc);
		
	
	}
	
}

