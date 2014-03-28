import java.util.*;


/* Questo Programma Converte Numeri Da Una Base All'Altra.
 * 
 * ---Input---   
 * Base Del Numero Originale
 * Base Finale
 * Numero Da Convertire
 * 
 * ---Output Base = 10 ---
 * [Base_orig] num_orig --->  [Base 10] num_decimal --->  [Base_final] num_final
 * 
 */
 
public class BaseConv {
	
	public static void main (String[] args) {
	
	
/* ======================= Definizione Variabili ======================= */
	
		int base_orig; // Base Del Primo Numero
		int base_final; // Base Finale
		int length_orig; // Numero Di Cifre Del Primo Numero
		int i; // Variabile Ciclo For
		int j; // Variabile Ciclo For
		int pow_tmp; // Variabile Per La Potenza Della Base
						
		String num_orig = new String(); // Numero Originale
		int num_decimal = 0; // Numero Convertito In Decimale
		String num_final = new String(); // Numero Convertito
		
		Scanner kb = new Scanner (System.in); // Definizione Scanner Tastiera
		
		
		
/* ======================= Input Utente ======================= */

		System.out.println ("Ciao !!! \n Io Converto I Numeri Da Una Base All'altra :)");
		
		
		do { // Input Base_Orig
		
			System.out.println ("\n Inserisci La Base In Cui E' Codificato Il Tuo Numero: ");
			base_orig = kb.nextInt();
			kb.nextLine();
			
			if (base_orig <= 0) { // Errore !! La Base é Minore o Uguale A Zero
				
				System.out.println ("!!! Error: La Base Deve Essere Maggiore Di Zero");
				
			}
			
		} while (base_orig <= 0);
		
		
		do { // Input Base_Final
			
			System.out.println ("\n Inserisci La Base In Cui Vuoi Convertire Il Tuo Numero: ");
			base_final = kb.nextInt();
			kb.nextLine();
		
			if (base_orig == base_final) { // Errore !! Le Basi Sono Uguali
			
				System.out.println ("Le Due Basi Coincidono !!!");
						
			}
			
			if (base_final <= 0) { // Errore !! La Base é Minore o Uguale A Zero
				
				System.out.println ("!!! Error: La Base Deve Essere Maggiore Di Zero");
				
			}
			
		} while (base_final <= 0 && base_orig == base_final);
		
		
		do { // Input Numero Da Convertire
			
			System.out.println ("\n Inserisci Il Numero Da Convertire: ");
			num_orig = kb.nextLine();
					
		} while (false);	
		
		
		// Calcolo Numero Cifre Numero Immesso 
		length_orig = num_orig.length();
		System.out.println ("\n\n\n length_orig = num_orig.length() = " + length_orig + "\n\n");
			
			
/* ======================= Conversione In Base Dieci (Integer) ======================= */
		
		for (i=0; i<length_orig; i++) { // Ciclo Per La COnversione In Base Dieci
				
			pow_tmp = 1;
				
			for (j=0; j<i; j++) { // Ciclo Calcolo pow_tmp
				
				pow_tmp *= base_orig;
				
			}
				
			num_decimal += pow_tmp*((int)num_orig.charAt(i) - (int)('0'));
			
			System.out.println ("num_decimal[" + i + "] = " + num_decimal);
				
		}
		
		System.out.println ("\n");
			
		
/* ======================= Conversione Nella Base Richiesta Se Diversa Da Dieci ======================= */

		if (base_final != 10) { // Conversione Nella Base Richiesta
			
			int result; // Valore Per Le Divisioni Successive
			int resto; // Resto Delle Divisioni Successive
			int num_decimal_tmp = num_decimal; // Variabile Temporanea Per Il Calcolo
						
			j = 0; // Indice Vettore array_final
			
			int[] array_final = new int[100000]; // Definizione Array
			int length_array_final; // NUmero Elementi Array Final
			
			do { // Ciclo Per La Conversione Di Ogni Cifra Nella Nuova Base
				
				result = (int)(num_decimal_tmp / base_final); // Calcolo Divisione
				
				resto = (num_decimal_tmp % base_final); // Calcolo Resto
				
				num_decimal_tmp = result; // Assegnamento Nuovo Numero Con Cui Fare La Divisione
				
				array_final[j] = resto; // Memorizzazione Resto
				
				j++; // Aumento Indice Elementi array_final
				
			} while (num_decimal_tmp != 0);
			
			length_array_final = j + 1; // Assegnamento 				
			num_final = ""; // Assegnamento Stringa Vuota A num_final
			
			for (i=0; i<length_array_final; i++) { // Il Vettore Va Preso Al Contrario !!!
				
				num_final += array_final[length_array_final-1-i];
				
			}			
			
		}
		
		
		
/* ======================= Output ======================= */
		
		if (base_final != 10) {
			
			System.out.println ("\n [Base " + base_orig + "] " + num_orig + " --->  [Base 10]" + num_decimal + " --->  [Base " + base_final + "] " + num_final);
		
		}
		
		if (base_final == 10) {
			
			System.out.println ("\n [Base " + base_orig + "] " + num_orig + " --->  [Base " + base_final + "] " + num_decimal);
		
		}
	
	
	}
		
}
