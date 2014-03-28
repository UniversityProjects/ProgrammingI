import java.util.*;

public class TestoCalcolaSconto {

	public static void main (String[] args) {

		double Price_Orig;
		double Price_Sconto;
		int Sconto;

		Scanner kb = new Scanner (System.in);

		System.out.print ("[*] Ciao! Calcolo Il Prezzo Finale Del Tuo Capo Di Abbigliamento Scontato \n\n");

		System.out.print ("Inserisci Il Prezzo Originale Del Capo Di Abbigliamento (es 5): ");
		Price_Orig = kb.nextDouble();

		System.out.print ("\nInserisci La Percentuale Di Sconto (es 10 per 10%): ");
		Sconto = kb.nextInt();

		Price_Sconto = Price_Orig - (Price_Orig*((double)Sconto/100));

		System.out.print ("\n\n\n");

		System.out.println ("[*] Prezzo Originale: " + Price_Orig);

		System.out.println ("[*] Sconto: " + Sconto + " %");

		System.out.println ("[*] Prezzo Finale: " + Price_Sconto);

	}

}
