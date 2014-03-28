import java.util.Scanner;


/* Scrivere un programma in Java che:
   - chieda in input all'utente un numero intero e 
   - verifichi e stampi a video alcune proprieta' del numero:
   		- se e' pari o dispari
		- se e' divisibile oppure no per 3
		- se e' divisibile oppure no per 5
   */
   
public class DivNum {

	public static void main (String[] args) {
		
		int num;
		Scanner kb = new Scanner (System.in);
		
		System.out.println("Inserisci Un Numero Intero: ");
		num = kb.nextInt();
		
		if (num%2 == 0) {
		
			System.out.println(num + "  � pari");
			
		}
		
		if (num%2 != 0) {
		
			System.out.println(num + "  � dispari");
			
		}
		
		if (num%3 == 0) {
		
			System.out.println(num + "  � divisibile per 3");
			
		}
		
		if (num%5 == 0) {
		
			System.out.println(num + "  � divisibile per 5");
			
		}		
		
	}
	
}