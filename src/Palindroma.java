import java.util.Scanner;


/* 
   Scrivere un programma in Java che, dopo aver chiesto una parola/frase
   all'utente verificchi se la parola/frase inserita e' palindroma.
   Esempi di parole palindrome sono:
   anna 
   radar 
   ailatiditalia
   */

public class Palindroma {

	public static void main (String[] args) {
	
		Scanner kb = new Scanner (System.in);
		
		String string_in = new String();
		
		boolean flag = true;
		
		boolean pal = true;
		
		int i = 0;
		
		int length;
		
		System.out.println ("Inserisci Una Parola: ");
		string_in = kb.nextLine();
				
		length = string_in.length();
		
		do {
		
			System.out.println (i);
			
			if ( string_in.charAt(i) == string_in.charAt(length - i - 1)) {
							
				if ( i == (length - i)) {
				
					flag = false;
					
				}
				
			} else {
			
				flag = false;
				pal = false;
				
			}			
			
			i++;
		
		} while (flag);
		
		if (pal) {
		
			System.out.println ("La parola " + string_in + " e' palindroma :) ");
			
		} else {
		
			System.out.println ("La parola " + string_in + " non e' palindroma :) ");
			
		}
	
	}
	
}