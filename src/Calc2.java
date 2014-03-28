import java.util.Scanner;


/****************
Scrivere un programma che simuli una calcolatrice reale che:
- Visualizza dapprima un menù che permetta all'utente di: 
                      - scegliere un'operazione algebrica (+,-,*,/) 
                      - azzerare il risultato ottenuto con le operazioni precedenti ('a')
                      - uscire dalla calcolatrice ('u')
- All'avvio del programma e dopo ogni azzeramento ('a') vengono chiesti all'utente 
  sia il primo operando che il secondo operando, le volte successive invece 
  si ri-visualizza il menù per la selezione dell'operazione desiderata e si richiede solo 
  il secondo operando, in quanto il primo operando è il risultato dell'operazione precedente.

- Il programma stampa a video il risultato ottenuto dopo ogni operazione valida

Suggerimento:
Schema menù:
+ somma
- sottrazione
* moltiplicazione
/ divisione
a azzera
u uscita dal programma
****************/

public class Calc2 {

	public static void main (String[] args) {
	
		String operator = new String();
		char operator_char;
		
		double num_1 = 0;
		double num_2 = 0;
		double result = 0;
		
		boolean first_time = true;
		boolean flag = true;
		
		Scanner kb = new Scanner(System.in);
		
		do {
		
			System.out.println ("[*] Scegli Cosa Fare: \n");
			System.out.println ("+ Domma");
			System.out.println ("- Differenza");
			System.out.println ("* Prodotto");
			System.out.println ("/ Divisione");
			System.out.println ("a Azzeramento");
			System.out.println ("u Uscita");
			
			System.out.print ("\nScelta: ");
			operator = kb.nextLine();
			
			System.out.println ("\n");
			
			operator_char = operator.charAt(0);
		
			if (first_time) {
				
				System.out.println("Inserisci Il Primo Numero: ");
				num_1 = kb.nextDouble();
				kb.nextLine();
				
				if ( operator_char == '/' ) { // num_2 != 0
					
					do {
				
						System.out.println("Inserisci Il Secondo Numero: ");
						num_2 = kb.nextDouble();
						kb.nextLine();
				
					} while (num_2 == 0);
			
				} else {
				
					System.out.println("Inserisci Il Secondo Numero: ");
					num_2 = kb.nextDouble();
					kb.nextLine();
						
				}
				
			}
			
			if (!first_time) {
			
				num_1 = result;
				
				if ( operator_char == '/' ) { // num_2 != 0
					
					do {
				
						System.out.println("Inserisci Il Secondo Numero: ");
						num_2 = kb.nextDouble();
						kb.nextLine();
				
					} while (num_2 == 0);
			
				}
			
			}
			
			if ( operator_char == '+' ) { // Somma
			
				result = num_1 + num_2;
				
				System.out.println (num_1 + " + " + num_2 + " = " + result );
				
				flag = true;
			
			}
			
			if ( operator_char == '-' ) { // Differenza
			
				result = num_1 - num_2;
				
				System.out.println (num_1 + " - " + num_2 + " = " + result );
				
				flag = true;
				
			}
			
			if ( operator_char == '*' ) { // Prodotto
				
				result = num_1 * num_2;
				
				System.out.println (num_1 + " * " + num_2 + " = " + result );
				
				flag = true;
				
			}
			
			if ( operator_char == '/' ) { // Divisione
				
				result = num_1 / num_2;
				
				System.out.println (num_1 + " / " + num_2 + " = " + result );
				
				flag = true;
				
			}
			
			if ( operator_char == 'a' ) {
				result = 0;
				flag = true;
				
			}	
			
			if ( operator_char == 'u' ) {
			
				System.exit(0);
				
			}	
			
			System.out.println ("\n\n");
		
		} while (flag);
	
	
	}
	
}