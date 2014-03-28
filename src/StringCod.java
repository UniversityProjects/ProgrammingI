import java.util.Scanner;


/*
 Scrivere un programma che riceve dall'utente una delle seguenti stringhe:
  "A-", "A0", "A+", "B-", "B0", "B+"
 e stampa a video il suo valore secondo il seguente codice:
  A- : 7, A0 : 10, A+ : 13, B- : 17, B0 : 20, B+ : 23
 (ovvero: A vale 10, B vale 20, - sottrae 3, + aggiunge 3)
*/


public class StringCod {

	public static void main (String[] args) {
	
		int result = 0;
		char char_1;
		char char_2;
		
		String string_in  = new String();
		
		Scanner kb = new Scanner (System.in);
		
		System.out.println ("Input: ");
		string_in = kb.next();
		kb.nextLine();
		
		char_1 = string_in.charAt(0);
		char_2 = string_in.charAt(1);
		
		if (char_1 == 'A') { result += 10; }
		
		if (char_1 == 'B') { result += 20; }
		
		if (char_2 == '-') { result -= 3; }
		
		if (char_2 == '+') { result += 3; }
		
		System.out.println (string_in + " -->  " + result);
		
	}
	
}