import java.util.*;

public class Accumulatore {

	public static void main (String[] arggs) {

		double subtotale;
		double prezzo_tmp;

		Scanner kb = new Scanner (System.in);

		subtotale = 0;

		System.out.println ("SubTotale = " + subtotale + " --- Inserisci Il Primo Prezzo: ");
		prezzo_tmp = kb.nextDouble();
		subtotale += prezzo_tmp;

		System.out.println ("\nSubTotale = " + subtotale + " --- Inserisci Il Secondo Prezzo: ");
		prezzo_tmp = kb.nextDouble();
		subtotale += prezzo_tmp;

		System.out.println ("\nSubTotale = " + subtotale + " --- Inserisci Il Terzo Prezzo: ");
		prezzo_tmp = kb.nextDouble();
		subtotale += prezzo_tmp;

		System.out.println ("\n\n[*] SubTotale Finale = " + subtotale); 

	}

}
