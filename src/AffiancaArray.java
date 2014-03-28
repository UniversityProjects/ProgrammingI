/****************
Scrivere un programma Java che:
- crea due array di interi qualunque precaricati nel programma
  ma con un array di 9 elementi e l'altro di 5 elementi
- chiede all'utente un intero 'l' tra 1 e 10
- invoca un metodo che stampa a video, affiancandoli su due colonne
  i contenuti dei primi l elementi dei due array, gestendo il caso di l>5,
  ad esempio, per l==6 stampera' le due colonne:
  1 2
  3 4
  5 6
  7 8
  9 10
  11 (niente)
- il metodo riceve come parametri un intero pari al valore di l
  e i due array, quindi con una intestazione tipo:
static public void nomeMetodo(int i, int []arr1, int []arr2) {...}
****************/

import java.util.Scanner;

public class AffiancaArray {

	public static void main (String[] args) {
	
		int[] Arr_1 = { 1, 3, 5, 3, 5, 5, 7, 7, 9 };
		int[] Arr_2 = { 1, 2, 3, 4, 5};
		
		Scanner kb = new Scanner (System.in);
		
		System.out.println ("Inserisci Un Numero l Compreso tra 1 e 10");
		int l = kb.nextInt();
		
		print_array(l,Arr_1,Arr_2);	
	
	}
	
	public static void print_array (int n, int[] Arr_1, int[] Arr_2) {
	
		if ( n < 6 ) {

			for (int i = 0; i<n; i++) {
			
				System.out.println (Arr_1[i] + "  " + Arr_2[i]);
				
			}
			
		}
		
		if ( n >= 6 && n != 10) {
		
			for (int i = 0; i<5; i++) {
			
				System.out.println (Arr_1[i] + "  " + Arr_2[i]);
				
			}
			
			for (int i = 5; i<n; i++) {
			
				System.out.println (Arr_1[i] + "  (niente)");
				
			}
		
		}
		
		if ( n == 10) {
		
			for (int i = 0; i<5; i++) {
			
				System.out.println (Arr_1[i] + "  " + Arr_2[i]);
				
			}
			
			for (int i = 5; i<9; i++) {
			
				System.out.println (Arr_1[i] + "  (niente)");
				
			}
			
			System.out.println ("(niente)  (niente)");
		
		}
	
	}

}
