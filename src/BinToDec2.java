import java.util.Scanner;



public class BinToDec2 {
  
	public static void main (String[] args) {
	
		String num_bin;
		int num_dec = 0;
		int base_orig = 2;
		int length_orig;		
		int i;
		int j;
		int pow;
				
		char zero_char = '0';
		
		Scanner kb = new Scanner (System.in);
		
		System.out.println ("Inserisci Un Numero Binario: ");
		num_bin = kb.nextLine();
		
		length_orig = num_bin.length();
		
		for (i=0; i<length_orig; i++) {
			
			pow = 1;
			
			for (j=0; j<i; j++) {
				
				pow *= base_orig;
				
			}
			
			num_dec += pow*((int)(num_bin.charAt(length_orig-1-i)) - ((int)zero_char));
			
		}
		
		System.out.println (num_bin + " ==> " + num_dec);
  
  
    }
  
}

