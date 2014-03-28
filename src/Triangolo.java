/*****************
Es.4, "Triangolo": Scrivere un programma che:
- chiede all'utente una cifra decimale da 0 a 6
- costruisce a video un triangolo di 4 righe come questo:
2
23
234
2345
dove pero' le cifre di ogni riga cominciano da quella data dall'utente (qui 2)
Suggerimenti:
- usare una variabile per ricordare la cifra di partenza e una per calcolare le successive
- usare per comodita' il copia/incolla e l'operatore '++'
- usare System.out.print(...) per stampare singole cifre e ..println(...) per la fine riga
******************/

import java.util.*;

public class Triangolo {

	public static void main (String[] args) {
	
		int num;
		int num_tmp;
		
		Scanner kb = new Scanner (System.in);
		
		System.out.println ("Inserisci un Numero Compreso Tra 0 e 6: ");
		num = kb.nextInt();
		
		num_tmp = num;
		
		System.out.println ("");
		System.out.println ("[*] Numero Scelto: " + num);
		System.out.println ("");
		
		// Prima Riga
		System.out.println (num);
		
		
		// Seconda Riga
		System.out.print (num_tmp);
		num_tmp++;
		System.out.print (num_tmp);
		System.out.println ("");
		
		
		// Terza Riga
		num_tmp = num;
		System.out.print (num_tmp);
		num_tmp++;
		System.out.print (num_tmp);
		num_tmp++;
		System.out.print (num_tmp);
		System.out.println ("");
		
		
		// Quarta Riga
		num_tmp = num;
		System.out.print (num_tmp);
		num_tmp++;
		System.out.print (num_tmp);
		num_tmp++;
		System.out.print (num_tmp);
		num_tmp++;
		System.out.print (num_tmp);
		System.out.println ("");	
	
	}
	
}