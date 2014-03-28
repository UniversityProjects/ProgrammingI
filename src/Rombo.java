
public class Rombo {

	public static void main (String[] args) {

		int i = 1;
		int s = 0; // Numero Spazi
		int c = 1; //  Numero Cancelletti
		int tmp = 0; // TMP Var

		while (i <= 4) { // Rombo Superiore
			
			s = 1;
			while (s<=((7-s)/2)) { // Print Spazi
				
				System.out.print  ("");
				s += 2;

			}
			
			while (tmp < c) {
				
				System.out.print ("#");

			}
			
			System.out.println ("");
			
			c += 2;
			i++;

		}
		
		i -= 1;
		
		while (i >=0 ) {
		
		
			i--;
			
		}

	}

}