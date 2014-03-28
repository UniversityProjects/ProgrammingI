import java.util.Scanner;
import java.lang.String;
import java.lang.Math;


public class MediaGeom {
	
	public static void main (String args[]) {
		
		boolean flag = true;
		
		double number_tmp;
		double product = 1;
		double result;
		
		int number_count = 0;
		
		Scanner kb = new Scanner (System.in);
		
		do {
			
			System.out.println ("Inserisci Il  Numero Positivo Da Aggiungere Alla Media Geometrica");
			System.out.println ("Per Fermare La Lista E Fare Il Calcolo, Inserire Un Numero Negativo:");
			
			number_tmp = kb.nextDouble();
			kb.nextLine();
			
			if (number_tmp > 0) {
				
				product *= number_tmp;
				number_count++;
				
			} else {
				
				flag = false;
				
			}			
			
		} while (flag);
		
		if (number_count == 0) {
				
			System.exit(0);
			
		}
			
		result = Math.pow (product,number_count);
			
		System.out.println ("\nResult = " + result);
		
	}
	
}

