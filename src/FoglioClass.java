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

import java.util.Scanner;

public class FoglioClass {
	
	// 0 -> x
	// 1 -> y
	double [] A = new double[2];
	double [] B = new double[2];
	double [] C = new double[2];
	double [] D = new double[2];
	
	String colore = new String();
	String materiale = new String();
	
	double area;
	
	Scanner kb = new Scanner (System.in);
	
	public void leggiInputGeom (String Name) {
	
		System.out.println ("  D --------- C");
		System.out.println ("    |        |");
		System.out.println ("    |        |");
		System.out.println ("    |        |");
		System.out.println ("    |        |");
		System.out.println ("    |        |");
		System.out.println ("    |        |");
		System.out.println ("    |        |");
		System.out.println ("    |        |");
		System.out.println ("    |        |");
		System.out.println ("    |        |");
		System.out.println ("  A --------- B");
		
		System.out.println ("\n" + Name);
		
		System.out.println ("Inserisci Le Coordinate Del Punto A (Basso A Sinistra): ");
		System.out.print ("X: ");
		A[0] = kb.nextInt();
		System.out.print ("Y: ");
		A[1] = kb.nextInt();
		kb.nextLine();
		System.out.print ("\n");
		
		System.out.println ("Inserisci Le Coordinate Del Punto B (Basso A Destra): ");
		System.out.print ("X: ");
		B[0] = kb.nextInt();
		System.out.print ("Y: ");
		B[1] = kb.nextInt();
		kb.nextLine();
		
		System.out.println ("Inserisci Le Coordinate Del Punto C (Alto A Destra): ");
		System.out.print ("X: ");
		C[0] = kb.nextInt();
		System.out.print ("Y: ");
		C[1] = kb.nextInt();
		kb.nextLine();
		
		System.out.println ("Inserisci Le Coordinate Del Punto D (Alto A Sinistra): ");
		System.out.print ("X: ");
		D[0] = kb.nextInt();
		System.out.print ("Y: ");
		D[1] = kb.nextInt();
		kb.nextLine();
		
		area = Math.abs(Math.abs(A[1]) - Math.abs(D[1]))*Math.abs(Math.abs(A[0]) - Math.abs(C[0]));
		
		System.out.println ("Inserisci Il Colore: ");
		colore = kb.nextLine();
		
		System.out.println ("Inserisci Il Materiale: ");
		materiale = kb.nextLine();	
		
	}
	
	public void scriviOutput (String Name) {
	
		System.out.println (Name);
		
		System.out.println ("A: (" + A[0] + " , " + A[1] + ")");
		
		System.out.println ("B: (" + B[0] + " , " + B[1] + ")");
		
		System.out.println ("C: (" + C[0] + " , " + C[1] + ")");
		
		System.out.println ("D: (" + D[0] + " , " + D[1] + ")");
		
		System.out.println ("Area = " + area);
		
		System.out.println ("Colore: " + colore);
		
		System.out.println ("Materiale: " + materiale);
		
		
	}
	

}

