import java.util.Scanner;



/*****************
Scrivere un programma Java che calcoli il segno zodiacale in base alla data di nascita.
Il programma deve quindi:
  - Chiedere all'utente giorno e mese di nascita e verificare che sia il giorno che il mese 
  siano corretti (ad es. non esiste il mese 13 oppure il 30 febbraio non esiste); nel caso che 
  il giorno o il mese non siano corretti, stampare a video un appropriato messaggio di errore;
  - Se i dati sono corretti, stampare a video il segno zodiacale dell'utente.

Tabella segni zodiacali:
Ariete: 21 marzo - 20 aprile
Toro: 21 aprile - 20 maggio
Gemelli: 21 maggio - 21 giugno
Cancro: 22 giugno - 23 luglio
Leone: 24 luglio - 23 agosto
Vegine: 24 agosto - 22 settembre
Bilancia: 23 settembre - 23 ottobre
Scorpione: 24 ottobre - 20 novembre
Sagittario: 21 novembre- 21 dicembre
Capricorno: 22 dicembre - 20 gennaio
Acquario: 21 gennaio - 19 febbraio
Pesci: 20 febbraio - 20 marzo

Utilizzare if-else per effettuare i controlli.
******************/


public class Zod {

	public static void main (String[] args) {
	
		int day;
		int month;
		
		Scanner kb = new Scanner (System.in);
		
		do {
			
			do {
			
				System.out.println ("Inserisci Il Giorno: ");
				day = kb.nextInt();
				
			} while ( day  > 31 );
			
			do {
				
				System.out.println ("Inserisci Il Mese: ");
				month = kb.nextInt();
			
			} while ( month > 13 );
			
		} while ( (day > 30 && month == 2) || ( day > 31 && (month == 3 || month == 5 || month == 7 || month == 10 || month == 12) ) );
		
		// Ariete: 21 marzo - 20 aprile
		if ( (day >= 21 && month == 3) || (day <= 20 && month == 4) ) { System.out.println ("Ariete"); }
		
		// Toro: 21 aprile - 20 maggio
		if ( (day >= 21 && month == 4) || (day <= 20 && month == 5) ) { System.out.println ("Toro"); }
		
		// Gemelli: 21 maggio - 21 giugno
		if ( (day >= 21 && month == 5) || (day <= 21 && month == 6) ) { System.out.println ("Gemelli"); }
		
		// Cancro: 22 giugno - 23 luglio
		if ( (day >= 22 && month == 6) || (day <= 23 && month == 7) ) { System.out.println ("Cancro"); }
		
		// Leone: 24 luglio - 23 agosto
		if ( (day >= 24 && month == 7) || (day <= 23 && month == 8) ) { System.out.println ("Leone"); }
		
		// Vegine: 24 agosto - 22 settembre
		if ( (day >= 24 && month == 8) || (day <= 22 && month == 9) ) { System.out.println ("Vergine"); }
		
		// Bilancia: 23 settembre - 23 ottobre
		if ( (day >= 23 && month == 9) || (day <= 23 && month == 10) ) { System.out.println ("Bilancia"); }
		
		// Scorpione: 24 ottobre - 20 novembre
		if ( (day >= 24 && month == 10) || (day <= 20 && month == 11) ) { System.out.println ("Scorpione"); }
		
		// Sagittario: 21 novembre- 21 dicembre
		if ( (day >= 21 && month == 11) || (day <= 21 && month == 12) ) { System.out.println ("Sagittario"); }
		
		// Capricorno: 22 dicembre - 20 gennaio
		if ( (day >= 22 && month == 12) || (day <= 20 && month == 1) ) { System.out.println ("Capricorno"); }
		
		// Acquario: 21 gennaio - 19 febbraio
		if ( (day >= 21 && month == 1) || (day <= 19 && month == 2) ) { System.out.println ("Acquario"); }
		
		// Pesci: 20 febbraio - 20 marzo
		if ( (day >= 20 && month == 2) || (day <= 20 && month == 3) ) { System.out.println ("Pesci"); }
		
	}
	
}