/***************************************
  Rivedere l'esercizio StampaCifre dell'esercitazione di laboratorio
  di settimana scorsa con le seguenti modifiche:
  - chiedere all'utente l'intero come stringa (cioe' utilizzando il metodo nextLine() invece 
  di nextInt());
  - utilizzare i metodi della classe String per estrarre e stampare a video la porzione di stringa
    corretta. 

------- Testo originale di StampaCifre -----
  Si scriva un programma in Java che:
  Chiede all'utente un numero intero tra 100 e 999 e produce
 a video le sue tre cifre decimali una per riga, nell'ordine unita'-decine-centinaia.
 Ad esempio, se l'utente inserisce il numero intero 123 il programma
 dovra' stampare a video:

 3
 2
 1
***************************************/

import java.util.Scanner;

public class StampaCifreStr {

	public static void main (String [] args) {
	
		String numero;
		char unit;
		char decine;
		char centinaia;
		
		Scanner kb = new Scanner (System.in);
		
		System.out.println ("Inserisci Un Numero Intero Compreso Tra 100 e 999: ");
		numero = kb.nextLine();
		
		System.out.println ("");
		
		System.out.println ("[*] Numero: " + numero + "\n");
		
		
		unit = numero.charAt(2);
		System.out.println (unit);
		
		decine = numero.charAt(1);
		System.out.println (decine);
		
		centinaia = numero.charAt(0);
		System.out.println (centinaia);
	
	}

}