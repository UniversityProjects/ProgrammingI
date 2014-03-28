import java.util.*;

public class two_kmin_x {

	public static void main (String [] args) {
	
		int k;
		int x;
		int i;
		int due_pow;
		int result;
		
		result = 0;
		
		Scanner key = new Scanner (System.in);
		
		System.out.println ("Input The Natural Number x: ");
		
		x = key.nextInt ();
		
		for (k = 0; k < x ; k++) {
			
			due_pow = 1;
			
			for (i = 0; i <= k; i++) {
			
				due_pow *= 2;
				
			}
			
			if (due_pow > x) {
			
				result = k - 1;
				
				k = x + 1;
				
			}				
		
		}
		
		System.out.println ("k tale che 2^k < " + x + " = " + result);
	
	}

}
