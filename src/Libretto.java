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

public class Libretto {
	
	public Scanner kb = new Scanner(System.in);
	
	public static final int NUM_ESAMI = 4;
	public int num_esami_inseriti = 0;
		
	public String [] nome_esami = new String [NUM_ESAMI];			
	public String [] voto_esami = new String [NUM_ESAMI];
		
	public String nome = new String();
	public String cognome = new String();
	public String matricola = new String();
		
	public void Input_Dati_Utente () {
	
		for (int i=0; i<NUM_ESAMI; i++) { nome_esami[i] = new String(); }
		
		for (int i=0; i<NUM_ESAMI; i++) { voto_esami[i] = new String(); }
		
		System.out.println ("Inserisci Il Tuo Nome: ");
		nome = kb.nextLine();
		
		System.out.println ("Inserisci Il Tuo Cognome: ");
		cognome = kb.nextLine();
		
		System.out.println ("Inserisci Il Tuo Numero Di Matricola: ");
		matricola = kb.nextLine();
		
	}
	
	public void Print_Libretto () {
	
		System.out.println ("\n\n\n");
		System.out.println ("[*] " + nome + "  " + cognome + "    " + matricola);
		
		for (int i=0; i<num_esami_inseriti; i++) { System.out.println (nome_esami[i] + " : " + voto_esami[i]); }
		
		System.out.println ("\n\n");
	
	}
	
	public void Insert_Grade () {
	
		boolean flag_inserted = false;
		String nome_tmp = new String();
		
		do {
			
			System.out.println ("Inserisci Il Nome Dell'Esame " + (num_esami_inseriti+1) + ": ");
			nome_tmp = kb.nextLine();
			
			for (int i=0; i<num_esami_inseriti; i++) { 
			
				if ( nome_esami[i].equals(nome_tmp) ) { 
				
					flag_inserted = false; 
									
				} 
				
			}
		
		} while (flag_inserted);
		
		nome_esami[num_esami_inseriti] = nome_tmp;
		
		System.out.println ("Inserisci il Voto Dell'Esame " + nome_esami[num_esami_inseriti] + ": ");
		voto_esami[num_esami_inseriti] = kb.nextLine();
		
		num_esami_inseriti++;
		
	}
	
}