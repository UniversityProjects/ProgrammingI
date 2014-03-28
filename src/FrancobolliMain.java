/**************
Scrivere un programma in Java che gestisce una raccolta di francobolli.
Creare 3 classi: 
- una con il main(), che allochera' un array di francobolli;
- una con la classe che descrive un francobollo, con attributi soltanto;
- una classe con metodi static che ricevono array di francobolli come argomenti.

Le specifiche sono:
- un francobollo e' descritto da: nazione, esemplari posseduti, valore in euro
  (nella raccolta posso avere piu' esemplari dello stesso tipo di francobollo,
   e nel programma li rappresentero' con un'unica istanza per ogni tipo)
- il metodo main():
  . chiede all'utente quanti tipi di francobolli ha nella collezione (max 10)
  . (!)alloca un array di un corrispondente numero di istanze di francobolli
  . chiede all'utente i dati di tali tipi e li carica in istanze nell'array
  . offre ripetutamente all'utente un menu di 5 operazioni:
    + conta esemplari totali
    + calcola valore totale della raccolta
    + cerca e visualizza il tipo francobollo di maggior valore
    + visualizza la nazione di cui si hanno piu' francobolli
    + esci dal menu (e quindi dal programma)
- nella classe con i metodi static implementare i metodi che effettuano le
  prime 4 operazioni in menu su un array di istanze ricevuto come argomento
  MA SENZA VISUALIZZARE NULLA, SOLO restituendo al chiamante (il main) il dato
  che gli permetta di completare verso l'utente l'operazione di menu
**************/

import java.util.Scanner;

public class FrancobolliMain {

	public static void main (String[] args) {
	
		Scanner kb = new Scanner(System.in);
		
		System.out.println ("Inserisci Il Numero Di Tipi Di Francobolli: ");
		int franc_num = kb.nextInt();
		kb.nextLine();
		
		Francobollo [] franc_arr = new Francobollo[franc_num];
		
		for (int i=0; i<franc_num; i++) { 
		
			franc_arr[i] = new Francobollo();
			
			System.out.println ("Inserisci La Nazione Del Francobollo " + i + " : ");
			franc_arr[i].nazione = kb.nextLine();
			
			System.out.println ("Inserisci Il Numero Di Esemplari Del Francobollo " + i + " : ");
			franc_arr[i].num_franc_tipo = kb.nextInt();
			kb.nextLine();
			
			System.out.println ("Inserisci Il Costo Dei Francobolli Del Francobollo " + i + " : ");
			franc_arr[i].money = kb.nextInt();
			kb.nextLine();
			
		}
		
		do {
		
			int choice = menu();
		
			System.out.println ("Scelta :  " + choice);
			
			switch (choice) {
		
				case 1: System.out.println ("\n\nNumero Esemplari Totale : " + Conta_Esemplari(franc_arr,franc_num)); 
						break;
				
				case 2: System.out.println ("\n\nValore Totale Esemplari: " + Value(franc_arr,franc_num));
						break;
			
				case 3: System.out.println ("\n\nValore Totale Esemplari: " + Most_Value(franc_arr,franc_num));
						break;
				
				case 4: int tmp = Most_Numbered(franc_arr,franc_num);
						System.out.println ("Nzione Del Most Numbered: " + franc_arr[tmp].nazione);
						break;
				
				case 5: System.exit(0); break;
			
			}
			
		} while (true);	
	
	}
	
	public static int menu () {
		
		Scanner kb = new Scanner(System.in);
		
		int cho = 0;
		
		do {
		
			System.out.println ("\n\n[*] Menu:\n");
		
			System.out.println ("1) Conta esemplari totali");
		
			System.out.println ("2) Calcola valore totale della raccolta");
		
			System.out.println ("3) Cerca e visualizza il tipo francobollo di maggior valore");
			
			System.out.println ("4) Visualizza la nazione di cui si hanno piu' francobolli");
			
			System.out.println ("5) Exit");
	
			System.out.println ("\nChoice: ");
			cho = kb.nextInt();
						
		} while (cho != 1 && cho != 2 && cho != 3 && cho != 4 && cho != 5);	
				
		return cho;
		
	}
	
	// 1 + conta esemplari totali
	public static int Conta_Esemplari (Francobollo [] franc_arr, int l_franc_arr) {
	
		int somma = 0;
		
		for (int i=0; i<l_franc_arr; i++) {
		
			somma += franc_arr[i].num_franc_tipo;
			
		}
		
		return somma;
		
	}
	
	// 2 + calcola valore totale della raccolta
	public static double Value (Francobollo [] franc_arr, int l_franc_arr) {
	
		double value = 0;
		
		for (int i=0; i<l_franc_arr; i++) {
		
			value += franc_arr[i].num_franc_tipo*franc_arr[i].money;
			
		}
		
		return value;
		
	}
	
	// 3 + cerca e visualizza il tipo francobollo di maggior valore
	public static int Most_Value (Francobollo [] franc_arr, int l_franc_arr) {
	
		int tmp = 0;
		
		for (int i=1; i<l_franc_arr; i++) {
		
			if (franc_arr[i].money > franc_arr[tmp].money) { tmp = i; };
			
		}
		
		return tmp;
		
	}
	
	// 4 + visualizza la nazione di cui si hanno piu' francobolli
	public static int Most_Numbered (Francobollo [] franc_arr, int l_franc_arr) {
	
		int tmp = 0;
		
		for (int i=1; i<l_franc_arr; i++) {
		
			if (franc_arr[i].num_franc_tipo > franc_arr[tmp].num_franc_tipo) { tmp = i; };
			
		}
		
		return tmp;
		
	}
	
}