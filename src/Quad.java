import java.util.Scanner;


public class Quad {

	public static void main  (String[] args) {

		double num;
		double quad;
		Scanner kb = new Scanner (System.in);

		System.out.println ("Inserisci Un Numero   E Restituiro Il Suo Quadrato: ");
		num =  kb.nextDouble();
		kb.nextLine();
		
		quad = quadrate(num);

		System.out.println  (num + "^2  -->  " + quad);

	}

	public  static double quadrate (double x) {
		
		return x*x;

	}

}
