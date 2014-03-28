/****************
  Scrivere un programma in Java che permetta all'utente
  di convertire temperature da Fahrenheit a Celsius e da C a F.
  Il programma deve permettere all'utente di continuare a convertire temperature 
  fino a quando decide di uscire (mostrare e gestire un menu apposito a tre scelte: 
  F-> C, C -> F, Uscita).

  Nell'implementazione del programma si dovranno definire, almeno, 
  i seguenti metodi:
  - convFtoC: prende come parametro una temperatura in F e ritorna la temperatura in C
  - convCtoF: prende come parametro una temperatura in C e ritorna la temperatura in F
  - menu: stampa a video il menu per l'utente


Suggerimenti:
- Si ricorda che per ora definiamo solo metodi 'static' che possono 
essere chiamati molto semplicemente dal (metodo) main di una classe;
i metodi descritti sopra saranno chiamati appunto dal main.
- Le formule di conversione sono le seguenti:
C = (F - 32) / 1,8
F = C * 1,8 + 32 
**********/

import java.util.Scanner;
import java.lang.String;

public class ConvertiTemperatura {

	public static void main (String[] args) {
	
		Scanner kb = new Scanner (System.in);
		
		boolean menu = true;
		
		int choice;
		
		do {
			
			choice = menu();
			
			double C;
			double F;
		
			if (choice == 1) { // convFtoC
			
				System.out.println ("Inserisci I Gradi In Fahrenheit");
				F = kb.nextDouble();
				kb.nextLine();
				
				C = convFtoC(F);
				
				System.out.println ("C = " + C + "  -->  F = " + F); 
		
			} else if (choice == 2) { // convCtoF
			
				System.out.println ("Inserisci I Gradi In Celsius");
				C = kb.nextDouble();
				kb.nextLine();
				
				F = convCtoF(C);
				
				System.out.println ("F = " + F + "  -->  C = " + C); 
			
			} else { // Exit
			
				menu = false;
			
			}
			
		} while (menu);
		
		
			
	}
	
	public static int menu () {
	
		int cho;
		
		Scanner kb = new Scanner (System.in);
		
		System.out.println ("[*] Conversione Di Temperature\n\n");
		System.out.println ("1) F --> C"); // convFtoC
		System.out.println ("2) C --> F"); // convCtoF
		System.out.println ("Other Keys: Exit"); // Exit
		
		System.out.print("\nChoice: ");
		cho = kb.nextInt();
		kb.nextLine();
		
		System.out.println ("\n\n\n");
		
		return cho;
	
	
	}
	
	public static double convFtoC (double F) {
	
		double C = ((F - 32) / 1.8);
		
		return C;
	
	
	}
	
	public static double convCtoF (double C) {
	
		double F = ((C * 1.8) + 32 );
		
		return F;
	
	}
	
	
}