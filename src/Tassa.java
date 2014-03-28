import java.util.Scanner;


/*
 Scrivere un programma che chiede all'utente un numero intero tra 0 e 500
  e stampa a video l'importo di una tassa calcolata su tale numero come segue:
 - per numeri da 0 a 100: tassa pari a 0
 - tra 100 e 200: tassa pari al 10% di (numero - 100), lo scaglione oltre 100
 - tra 200 e 300: tassa pari a: 10% di 100 + il 20% di (numero - 200)
 - oltre 300: tassa pari a: 10% di 100 + 20% di 100 + il 30% di (numero - 300)
 Verificare cosa accade per numeri sul limite di scaglione, tipo 199, 200, 201
*/


public class Tassa {

	public static void main (String[] args) { 
		
		int num;
		int tassa = 0;
		
		Scanner kb = new Scanner (System.in);
		
		do {
			
			System.out.println("Inserisci Un Numero Intero Tra 0 e 500: ");
			num = kb.nextInt();
		
		} while ( num < 0 && num > 500 );
		
		if ( num <= 100 ) { System.out.println ("num <= 100)"); tassa = 0; }
		
		if ( num > 100 && num <= 200 ) { tassa = (num - 100)/(10); }
		
		if ( num > 200 && num <= 300 ) { tassa = 10 + (num - 200)/(5); }
		
		if ( num > 300 ) { tassa = 10 + 20 + (((num - 300)*(30))/100); }
		
		System.out.println ("Tassa = " + tassa);
	
	}
	
}