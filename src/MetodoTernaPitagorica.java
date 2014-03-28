/************
Scrivere un programma che chiede all'utente tre interi positivi
continuando a chiederne altri tre fintanto che NON sono terna pitagorica
(tre numeri a b c sono terna pitagorica se a*a + b*b = c*c)

Incapsulare e poi usare il test tramite un metodo che verifica tale proprieta'
ricevendo come argomenti i tre interi e restituendo un valore booleano:
'true' quando i tre argomenti costutuiscono una terna pitagorica, altrim.'false'
************/

import java.util.Scanner;
import java.lang.String;

public class MetodoTernaPitagorica {

	public static void main (String[] args) {
	
		boolean terna = false;
		int a;
		int b;
		int c;
		
		Scanner kb = new Scanner (System.in);
		
		do {
		
			System.out.println ("Inserisci Il Primo Numero: ");
			a = kb.nextInt();
			kb.nextLine();
		
			System.out.println ("Inserisci Il Secondo Numero: ");
			b = kb.nextInt();
			kb.nextLine();
		
			System.out.println ("Inserisci Il Terzo Numero: ");
			c = kb.nextInt();
			kb.nextLine();
		
			terna = IsTerna (a,b,c);
		
			if (terna) { 
			
				System.out.println ("La Terna E' Pitagorica :) ");
				
			} else {
			
				System.out.println ("La Terna Non E' Pitagorica :(\n");
				
			}
			
		} while (!terna);
		
	}
	
	public static boolean IsTerna (int a, int b, int c) {
	
		if (a*a + b*b == c*c) { 
			
			return true;

		} else {
		
			return false;
			
		}
	
	}
	
}