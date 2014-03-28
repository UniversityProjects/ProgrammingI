import java.util.*;

public class StampaCifre {

	public static void main (String[] args) {
	

		int num_in;
		int num_in_tmp;
		
		int cifra_uno;
		int cifra_due;
		int cifra_tre;

		Scanner kb = new Scanner (System.in);
		

		System.out.println ("Inserisci Un Numero Intero Tra 100 e 999: ");
		num_in = kb.nextInt();
		
		num_in_tmp = num_in;
		System.out.print ("\n\n");


		cifra_uno = num_in/100;
		num_in = num_in - cifra_uno*100;
		System.out.println ("Cifra Uno: " + cifra_uno);


		cifra_due = num_in/10;
		num_in = num_in - cifra_due*10;
		System.out.println ("Cifra Due: " + cifra_due);


		cifra_tre = num_in;
		System.out.println ("Cifra Tre: " + cifra_tre);
		
		
		System.out.println ("\n\n" + num_in_tmp + " --] " + cifra_tre + " " + cifra_due + " " + cifra_uno);


	}

}
