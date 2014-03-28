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

public class AppartamentoMain {
	
	public static void main (String args[]) {
		
		AppartamentoClass casa1 = new AppartamentoClass();
		AppartamentoClass casa2 = new AppartamentoClass();
		
		String casa1_name = new String();
		String casa2_name = new String();
		
		casa1_name = "Casa 1";
		casa2_name = "Casa 2";
		
		// Popolo Casa 1
		casa1.leggiInput(casa1_name);
		System.out.println("\n");
		
		// Popolo Casa 2
		casa2.leggiInput(casa2_name);
		System.out.println("\n");
		
		System.out.println("\n\n\n");
		
		
		// Print Casa1
		casa1.scriviOutput(casa1_name);
		
		// Print Casa2
		casa2.scriviOutput(casa2_name);
		
		
		System.out.println("\n\n\n");
		
		
		// Dimensioni
		if ( casa1.area > casa2.area ) {
			
			System.out.println ("Casa1, e' di " + casa1.area + " metri quadri e' la più grande");
		
		}
		
		if ( casa1.area < casa2.area ) {
			
			System.out.println ("Casa2, che e' di " + casa2.area + " metri quadri e' la piu' grande");
		
		}
		
		if ( casa1.area == casa2.area ) {
			
			System.out.println ("Casa1 e Casa2 sono della stessa dimensione di " + casa1.area + " metri quadri");
		
		}
		
		
		
		// Prezzi
		if ( casa1.price > casa2.price ) {
			
			System.out.println ("Casa1, che costa " + casa1.price + " € e' la più costosa");
		
		}
		
		if ( casa1.price < casa2.price ) {
			
			System.out.println ("Casa2, che costa " + casa2.price + " € e' la più costosa");
		
		}
		
		if ( casa1.price == casa2.price ) {
			
			System.out.println ("Casa1 e Casa2 costano uguali: " + casa1.price + " €");
		
		}
		
		
		System.out.println("\n\n\n");
		
		
	}

}

