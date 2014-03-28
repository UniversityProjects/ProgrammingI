/*****************
  Definire una classe che rappresenti un appartamento. 
  La classe verra' utilizzata (in futuro con successivi miglioramenti) 
  per permettere ad un possibile acquirente di ricercare un appartamento da acquistare 
  scegliendone alcune caratteristiche (ad es. numero di locali, metri quadri, 
  disponibilita' o meno del box/cantina, ecc.).
  Nella classe Appartamento definite:
  - gli attributi che ritenete piu' significativi (almeno 5), 
  - i seguenti metodi:
  	- leggiInput(): che richiede i dati di un appartamento da tastiera e 
	con essi popola un'istanza di appartamento;
  	- scriviOutput(): stampa i video i valori degli attributi (variabili di istanza)
		di uno specifico appartamento;
	Si faccia particolare attenzione a definire in maniera appropriata "la segnatura" dei metodi 
	(aiutandosi eventualmente con l'esempio della classe Specie del libro di testo).

  Scrivere inoltre un programma Java che utilizzi la classe Appartamento e che:
	- Crei e popoli con dati appropriati due appartamenti;
  	- Stampi i dati dei due appartamenti;
	- Stampi a video quale dei due appartamenti:
		- e' piu' grande;
		- e' piu' costoso.
******************/

import java.util.Scanner;

public class AppartamentoClass {
	
	public int num_locali;
	public double area;
	public double price;
	public boolean box_bool;
	public boolean cantina_bool;
	
	Scanner kb = new Scanner (System.in);
	
	public void leggiInput(String Name) {
			
		System.out.println ("\n" + Name);
		
		System.out.println ("Inserisci il numero di locali: ");
		num_locali = kb.nextInt();
		kb.nextLine ();
		
		System.out.println ("Inserisci l'area dell'appartamento in metri quadri: ");
		area = kb.nextDouble();
		kb.nextLine ();
		
		System.out.println ("Inserisci il prezzo dell'appartamentio: ");
		price = kb.nextDouble();
		kb.nextLine ();
		
		System.out.println ("Inserisci T se e' presente un box garage, qualunque altro tasto altrimenti: ");
		String string_box_bool = kb.nextLine();
		if ( string_box_bool.charAt (0) == 't' || string_box_bool.charAt(0) == 'T' ) {
			
			box_bool = true;
			
		} else {
			
			box_bool= false;
			
		}
		
		System.out.println ("Inserisci T se e' presente una cantina, qualunque altro tasto altrimenti: ");
		String string_cantina_bool = kb.nextLine();
		if ( string_cantina_bool.charAt (0) == 't' || string_cantina_bool.charAt(0) == 'T' ) {
			
			cantina_bool = true;
			
		} else {
			
			cantina_bool= false;
			
		}
		
	
	}
	
	public void scriviOutput(String Name) {
		
		System.out.println ("\n" + Name);
		
		System.out.println ("Numero dei Locali: " + num_locali);
				
		System.out.println ("Area: " + area);
		
		System.out.println ("Prezzo: " + price);
		
		System.out.print ("Box Garage: ");
		if ( box_bool ) { 
			
			System.out.print ("Si"); 
		
		} else {
			
			System.out.print ("No"); 
			
		}
		System.out.print ("\n"); 
		
		System.out.print ("Cantina: ");
		if ( cantina_bool ) { 
			
			System.out.print ("Si"); 
		
		} else {
			
			System.out.print ("No"); 
			
		}
		System.out.print ("\n"); 
		
	}
	
}

