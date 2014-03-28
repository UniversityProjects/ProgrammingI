/*****************
  Definire una classe che rappresenti un foglio rettangolare sul piano,
inserendovi attributi utili (ad es. coordinate dei vertici
oppure un vertice e lunghezza dei lati, tipo, colore, ecc.).
  Nella classe Foglio definite:
  - gli attributi che ritenete piu' significativi (almeno 5), 
  - i seguenti metodi:
  	- leggiInput(): che richiede i dati di un foglio da tastiera e 
        	con essi popola un'istanza di foglio;
  	- scriviOutput(): stampa i video i valori degli attributi (variabili di istanza)
		di uno specifico foglio;

N.B. Tutti i rettangoli avranno i lati allineati agli assi verticale e orizzontale

  Scrivere inoltre un programma Java che utilizzi la classe Foglio e che:
	- Crei e popoli con dati appropriati due fogli;
  	- Stampi i dati dei due fogli;
	- Stampi a video quale dei due fogli e' piu' ampio (area);
        - Verifichi e avvisi se i due fogli sono in contatto sul piano;
        - Crei e popoli una nuova istanza di foglio tale che copra sul piano le due
            istanze create sopra, chiedendo all'utente che valori dare agli attributi
            non geometrici (come tipo e colore, mentre posizione e dimensione
            sono determinati dall'esigenza di coprire i due primi fogli);
        - Stampi a video i dati del terzo foglio cosi' creato.
******************/

import java.lang.Math;
import  java.util.Scanner;

public class FoglioMain {
	
	public static void main (String args[]) {
		
		FoglioClass foglio1 = new FoglioClass();
		FoglioClass foglio2 = new FoglioClass();
		FoglioClass foglio3 = new FoglioClass();
		
		String foglio1_name = new String();
		String foglio2_name = new String();
		String foglio3_name = new String();
		
		foglio1_name = "Foglio 1";
		foglio2_name = "Foglio 2";
		foglio3_name = "Foglio 3";
		
		Scanner kb = new Scanner (System.in);
		
		
		// Popolo foglio 1
		foglio1.leggiInputGeom(foglio1_name);
		System.out.println("\n");
		
		// Popolo foglio 2
		foglio2.leggiInputGeom(foglio2_name);
		System.out.println("\n");
		
		
		System.out.println("\n\n\n");
		
		
		// Print foglio1
		foglio1.scriviOutput(foglio1_name);
		
		// Print foglio2
		System.out.println ("\n\n");
		foglio2.scriviOutput(foglio2_name);
		
		// Area Maggiore
		if ( foglio1.area > foglio2.area ) {
			
			System.out.println ("Foglio1, di dimensione " + foglio1.area + " metri quadri e' il foglio piu' grande");
		
		}
		
		if ( foglio2.area < foglio2.area ) {
			
			System.out.println ("Foglio2, di dimensione " + foglio2.area + " metri quadri e' il foglio piu' grande");
		
		}
		
		
		System.out.println("\n\n\n");
		
		
		// foglio3.A[0]		
		if (Math.abs(foglio1.A[0]) <= Math.abs(foglio2.A[0])) {
			foglio3.A[0] = foglio1.A[0];
		} else {
			foglio3.A[0] = foglio2.A[0];
		}
		
		// foglio3.A[1]		
		if (Math.abs(foglio1.A[1]) <= Math.abs(foglio2.A[1])) {
			foglio3.A[1] = foglio1.A[1];
		} else {
			foglio3.A[1] = foglio2.A[1];
		}
		
		// foglio3.B[0]		
		if (Math.abs(foglio1.B[0]) >= Math.abs(foglio2.B[0])) {
			foglio3.B[0] = foglio1.B[0];
		} else {
			foglio3.B[0] = foglio2.B[0];
		}
		
		// foglio3.B[1]		
		if (Math.abs(foglio1.B[1]) <= Math.abs(foglio2.B[1])) {
			foglio3.A[1] = foglio1.B[1];
		} else {
			foglio3.A[1] = foglio2.A[1];
		}
		
		// foglio3.C[0]		
		if (Math.abs(foglio1.C[0]) >= Math.abs(foglio2.C[0])) {
			foglio3.C[0] = foglio1.C[0];
		} else {
			foglio3.C[0] = foglio2.C[0];
		}
		
		// foglio3.C[1]		
		if (Math.abs(foglio1.C[1]) >= Math.abs(foglio2.C[1])) {
			foglio3.C[1] = foglio1.C[1];
		} else {
			foglio3.C[1] = foglio2.C[1];
		}
		
		// foglio3.D[0]		
		if (Math.abs(foglio1.D[0]) <= Math.abs(foglio2.D[0])) {
			foglio3.D[0] = foglio1.D[0];
		} else {
			foglio3.D[0] = foglio2.D[0];
		}
		
		// foglio3.D[1]		
		if (Math.abs(foglio1.D[1]) >= Math.abs(foglio2.D[1])) {
			foglio3.D[1] = foglio1.D[1];
		} else {
			foglio3.D[1] = foglio2.D[1];
		}
		
		
		
		// Caratteristiche Non Geometriche Terzo Foglio
		System.out.println (foglio3_name);
		
		System.out.println ("Inserisci Il Colore: ");
		foglio3.colore = kb.nextLine();
		
		System.out.println ("Inserisci Il Materiale: ");
		foglio3.materiale = kb.nextLine();
		
		
		// Print foglio3
		System.out.println("\n\n\n");
		foglio3.scriviOutput(foglio3_name);
		
		
	}
	
}

