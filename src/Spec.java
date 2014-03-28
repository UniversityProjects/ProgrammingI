import java.util.Scanner;

public class Spec {
	
	public String spec_nome = new String();
	public int spec_numero;
	public double spec_tasso_grow;
	
	public void InputReader (int num) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println ("Inserisci Il Tipo Di Animali Della Specie " + num);
		spec_nome = kb.nextLine();
		
		System.out.println ("Inserisci Il Numero Di " + spec_nome);
		spec_numero = kb.nextInt();
		kb.nextLine();
		
		System.out.println ("Inserisci Il Tasso Di Crescità Della Popolazione Di " + spec_nome);
		spec_tasso_grow = kb.nextDouble();
		kb.nextLine();		
		
		System.out.println ("\n\n");
		
	}	
	
	public void OutputPrint () {
		
		System.out.println ("Spec: " + spec_nome);
		
		System.out.println ("Numero Individui: " + spec_numero);
		
		System.out.println ("Tasso Crescità Annuo: " + spec_tasso_grow);
		
		System.out.println ("");
		
	}
	
}

