import java.util.*;

public class eta {

	public static void main (String [] args) {
	
		int day;
		int month;
		int year;
		int age;
		
		int new_year;
		
		Scanner key = new Scanner (System.in);
		
		System.out.println ("Input The Day Number: ");
		day = key.nextInt ();
		
		System.out.println ("Input The Month Number: ");
		month = key.nextInt ();
		
		System.out.println ("Input The Year Number: ");
		year = key.nextInt ();
		
		System.out.println ("Input The Age: ");
		age = key.nextInt ();
		
		new_year = year + age;
		
		System.out.println ("Birth Date:  " + day + " / " + month + " / " + year);	
		
		System.out.println ("Final Date:  " + day + " / " + month + " / " + new_year);	
	
	}

}
