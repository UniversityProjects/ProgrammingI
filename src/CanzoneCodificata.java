/****************
Scrivere un programma Java che:
- crea un array di stringhe contenente i seguenti sostantivi:
"il fiore"
"la casa"
"lo gnu"
"un sasso"
- crea un array di stringhe contenente i seguenti aggettivi:
"bello"
"buono"
"brutto"
"cattivo"
- crea un array di stringhe contenente i seguenti verbi:
"e'"
"mangia"
"rende"
"sembra"
N.B. I suddetti contenuti sono caricati dal programma stesso, cosi':
String [] arr = {"tizio", "caio", "sempronio"};
- chiede all'utente una stringa fatta di coppie lettera-cifra,
dove le lettere possono essere solo "s"(sostantivi),"a"(aggettivi),"v"(verbi)
e le cifre possono essere solo "0","1","2","3"(posizioni negli array sopra)
- produce a video il testo ottenuto decodificando la stringa, ad esempio:
input: "s0v3s3a2", output: "il fiore sembra un sasso brutto"

Nota:le coppie ricevute sono sempre valide ma in quantita' non fissata a priori
****************/

import java.util.Scanner;

public class CanzoneCodificata {

	public static void main (String[] args) {
	
		Scanner kb = new Scanner(System.in);
		String input = new String();
		
		String[] s = { "il fiore", "la casa", "lo gnu", "un sasso"};
		String[] a = { "bello", "buono", "brutto", "cattivo"};
		String[] v = { "e'", "mangia", "rende", "sembra"};
		
		System.out.println ("Inserisci Il Codice Segreto: ");
		input = kb.nextLine();
		
		codifica(input,s,a,v);
		
		System.out.println ("\n");
		
	}
	
	public static void codifica (String input, String[] s, String[] a, String[] v) {
	
		if ( input.charAt(0) == 's' ) { // S
		
			if ( input.charAt(1) == '0' ) { System.out.print (s[0] + " "); }
			
			if ( input.charAt(1) == '1' ) { System.out.print (s[1] + " "); }
			
			if ( input.charAt(1) == '2' ) { System.out.print (s[2] + " "); }
			
			if ( input.charAt(1) == '3' ) { System.out.print (s[3] + " "); }
			
		}
		
		if ( input.charAt(0) == 'v' ) { // V
		
			if ( input.charAt(1) == '0' ) { System.out.print (v[0] + " "); }
			
			if ( input.charAt(1) == '1' ) { System.out.print (v[1] + " "); }
			
			if ( input.charAt(1) == '2' ) { System.out.print (v[2] + " "); }
			
			if ( input.charAt(1) == '3' ) { System.out.print (v[3] + " "); }
			
		}
		
		if ( input.charAt(0) == 'a' ) {  // A
		
			if ( input.charAt(1) == '0' ) { System.out.print (a[0] + " "); }
			
			if ( input.charAt(1) == '1' ) { System.out.print (a[1] + " "); }
			
			if ( input.charAt(1) == '2' ) { System.out.print (a[2] + " "); }
			
			if ( input.charAt(1) == '3' ) { System.out.print (a[3] + " "); }
			
		}
	
		input = input.substring(2);
		
		//System.out.println ("\n" + input);
		if (input.length() >= 2) { codifica(input,s,a,v); }
		
	}
	
}