/************************
Scrivere un programma che simuli un libretto universitario.
Dovrà prevedere di:
- Al lancio del programma, richiedere il nome, cognome e matricola dello studente
- successivamente visualizzare un menù che permetta di scegliere fra:
  - inserire un nuovo esame
  - visualizzare il libretto
  - uscire dal programma

Suggerimenti:
- Utilizzare due array monodimensionali distinti per i nomi degli esami e i voti:
  - Ad esempio, l'esame di Programmazione 1 avra' il nome all'indice 0 di un array 
  e il voto relativo sara' all'indice 0 dell'altro array;
  - Il numero di esami del libretto (dimensione dei due array) sia definito come costante.
- In fase di inserimento di un esame si controlli che:
	- il voto inserito sia valido (tra 18 e 33)
	- l'esame non sia gia' presente nel libretto
*/

import java.util.Scanner;

public class LibrettoMain {

	public static void main (String[] args) {
	
		Libretto libr = new Libretto();
				
		libr.Input_Dati_Utente();
		
		do {
		
			int choice = menu();
		
			System.out.println ("Scelta :  " + choice);
			
			switch (choice) {
		
				case 1: libr.Insert_Grade(); break;
				
				case 2: libr.Print_Libretto(); break;
			
				case 3: System.exit(0); break;
			
			}
			
		} while (true);	
	
	}

	public static int menu () {
		
		Scanner kb = new Scanner(System.in);
		
		int cho = 0;
		
		do {
		
			System.out.println ("\n\n[*] Menu:\n");
		
			System.out.println ("1) Inserisci Un Nuovo Esame");
		
			System.out.println ("2) Visualizza Il Libretto");
		
			System.out.println ("3) Esci");
	
			System.out.println ("\nChoice: ");
			cho = kb.nextInt();
						
		} while (cho != 1 && cho != 2 && cho != 3);	
				
		return cho;
		
	}
	
}