import java.util.*;

public class hi {

	public static void main (String[] args) {
		
		int number_input; // input
		
		int number_output; // output		
		
		System.out.println ("Print the Number: ");
		
		Scanner key = new Scanner (System.in);
		
		number_input = key.nextInt();
		
		number_output = number_input*number_input;
		
		System.out.println ("");
		
		System.out.println ("\n");
		
		System.out.println ("Number Input: " + number_input);
		
		System.out.println ("Number Output: " + number_output);
		
	}

}
