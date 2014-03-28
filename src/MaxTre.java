import java.util.Scanner;


/*
 Scrivere un programma che riceve in input tre numeri di tipo double

  e stampa a video il valore maggiore dei tre
*/


public class MaxTre {

	public static void main (String[] args) {
	
		double num_1;
		double num_2;
		double num_3;
		
		double max;
		
		Scanner kb = new Scanner (System.in);
		
		System.out.println ("Inserisci Il Primo Valore: ");
		num_1 = kb.nextInt();
		kb.nextLine();
		
		System.out.println ("Inserisci Il Secondo Valore: ");
		num_2 = kb.nextInt();
		kb.nextLine();
		
		System.out.println ("Inserisci Il Terzo Valore: ");
		num_3 = kb.nextInt();
		kb.nextLine();
		
		max = num_1;
		
		if (num_2 > max) { max = num_2; }
		
		if ( num_3 > max ) { max = num_3; }
		
		System.out.println ("Il Massimo tra " + num_1 + " | " + num_2 + " | " + num_3 + " risulta essere :  " + max);
		
	
	}
	
}