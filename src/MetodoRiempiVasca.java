/*******************
Scrivere un programma che chiede per 3 volte (con ciclo while)
una coppia di numeri float: capienza_vasca e capienza_secchio
Ogni volta il programma dovra' invocare con tali due valori
il metodo quanti_secchi() descritto sotto e visualizzarne il valore restituito.

Metodo quanti_secchi():
- riceve due argomenti di tipo float, chiamiamoli 'a' e 'b'
- simula il ripetuto versare 'a' litri in una vasca di capacita' 'b' litri
- N.B. la vasca perde ad ogni versamento 1.1 litri
- la simulazione puo' essere con un ciclo o un'espressione matematica
- il metodo restituisce l'intero corripondente a quanti versamenti devo fare
  per riempire la vasca, ad esempio: a==2.4 b==12, restituisco 10
*******************/

import java.util.Scanner;
import java.lang.String;

public class MetodoRiempiVasca {

	public static void main (String[] args) {
	
		int i = 0;
		
		float capienza_vasca = 0;
		float capienza_secchio = 0;
		
		Scanner kb = new Scanner (System.in);
		
		while (i < 3) {
		
			System.out.println ("Inserisci La Campienza Del Secchio: ");
			capienza_secchio = kb.nextFloat();
			kb.nextLine();
			
			System.out.println ("Inserisci La Campienza Della Vasca: ");
			capienza_vasca = kb.nextFloat();
			kb.nextLine();
			
			if ( quanti_secchi(capienza_secchio,capienza_vasca) == -1) {
				
				System.out.println ("La Vasca Non Si Riempirà Mai");
				
			} else {
			
				System.out.println ("Numero Secchi: " + quanti_secchi(capienza_secchio,capienza_vasca));
			
			}
			
			i++;
			
			System.out.println ("\n");
			
		}
	
	}
	
	public static int quanti_secchi (float capienza_secchio, float capienza_vasca) {
		
		if ( capienza_secchio >= (capienza_vasca + 1.1) ) { 
			
			return 1;
				
		}
			
		float num_secchi = (capienza_vasca) / (capienza_secchio - (float)(1.1));
			
		if ( num_secchi == (float)((int) num_secchi) ) {
			
			return ((int) num_secchi);
				
		} else {
			
			return (((int) num_secchi) + 1);
				
		}
			
	}
		
}