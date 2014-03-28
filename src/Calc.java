import java.util.Scanner;

/*****************
Scrivere un programma Java che implementi una semplice calcolatrice.
Il programma deve:
- Visualizzare il menù per la scelta del tipo di operazione:
	Digita
	+ per sommare
	- per sottrarre
	* per moltiplicare
	/ per dividere
 
 e richiedere in input il tipo di operazione;
- Chiedere all'utente i due operandi;
- Controllare in caso di divisione che l'utente non divida per 0;
- Eseguire l'operazione scelta e stampare a video il risultato.

******************/

public class Calc {

	public static void main (String[] args) {
		
		String operator = new String();
		char operator_char;
		
		double num_1 = 0;
		double num_2 = 0;
		double result = 0;
		
		boolean flag = false;
		
		Scanner kb = new Scanner (System.in);
		
		do {
			
			System.out.print ("Inserisci Un'Operatore Tra: \n + \n - \n * \n / \n\n Scelta: ");
			operator = kb.nextLine();
			
			operator_char = operator.charAt(0);
			
			if ( operator_char == '+' ) {
			
				System.out.println("Inserisci Il Primo Numero: ");
				num_1 = kb.nextDouble();
				
				System.out.println("Inserisci Il Secondo Numero: ");
				num_2 = kb.nextDouble();
				
				result = num_1 + num_2;
				
				System.out.println (num_1 + " + " + num_2 + " = " + result );
				
				flag = true;
			
			}
			
			if ( operator_char == '-' ) {
			
				System.out.println("Inserisci Il Primo Numero: ");
				num_1 = kb.nextDouble();
				
				System.out.println("Inserisci Il Secondo Numero: ");
				num_2 = kb.nextDouble();
				
				result = num_1 - num_2;
				
				System.out.println (num_1 + " - " + num_2 + " = " + result );
				
				flag = true;
				
			}
			
			if ( operator_char == '*' ) {
				
				System.out.println("Inserisci Il Primo Numero: ");
				num_1 = kb.nextDouble();
				
				System.out.println("Inserisci Il Secondo Numero: ");
				num_2 = kb.nextDouble();
				
				result = num_1 * num_2;
				
				System.out.println (num_1 + " * " + num_2 + " = " + result );
				
				flag = true;
				
			}
			
			if ( operator_char == '/' ) {
				
				System.out.println("Inserisci Il Primo Numero: ");
				num_1 = kb.nextDouble();
				
				do {
				
					System.out.println("Inserisci Il Secondo Numero: ");
					num_2 = kb.nextDouble();
				
				} while (num_2 == 0);
				
				result = num_1 / num_2;
				
				System.out.println (num_1 + " / " + num_2 + " = " + result );
				
				flag = true;
				
			}
	
		} while (!flag);
		
		
		
	}
	
}