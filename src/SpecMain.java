
public class SpecMain {

	public static void main (String [] args) {
	
		Spec uno = new Spec();
		Spec due = new Spec();
		
		uno.InputReader(1);
		due.InputReader(2);
		
		uno.OutputPrint();
		due.OutputPrint();
		
		raggiunto(uno.spec_numero,uno.spec_tasso_grow,due.spec_numero,due.spec_tasso_grow);		
	
	}
	
	public static void raggiunto (int num_uno, double grow_uno, int num_due, double grow_due) {
		
		int final_uno = 0;
		int final_due = 0;
		int years = 1;
		boolean flag = false;
		
		if ( (num_uno > num_due && grow_uno > grow_due) && (num_due > num_uno && grow_due > grow_uno) ) {
		
			System.out.println ("Le Popolazioni Non Si Raggiungeranno Mai !!!");
			return;
			
		}
		
		do {
			
			final_uno = number_after_year (years,num_uno,grow_uno);
			
			final_due = number_after_year (years,num_due,grow_due);
			
			if (final_uno == final_due) {
				
				flag = true;
				System.out.println ("Le Popolazioni Si Raggiungono Dopo " + num_uno + " anni (" + final_uno + " Individui )");
			
			}
			
			years++;
		
		} while (!flag);
		
		
	}
	
	public static int number_after_year(int year, int spec_numero, double spec_tasso_grow) {
		
		int final_number = spec_numero;
		
		for (int i = 1; i < year; i++) {
			
			final_number += final_number*spec_tasso_grow;
		
		}
		
		return final_number;
		
	}
	
}	
