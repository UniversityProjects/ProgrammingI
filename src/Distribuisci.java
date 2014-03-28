/*****************
Es.5, "Distribuisci": Scirivere un programma che:
- chiede all'utente una cifra x da 1 d 9
- distribuisce ipotetiche x monete tra 3 persone A B C,
 e stampa a video quante ne riceve ciascuno. Esempio:
 x:6 => risultato a video: A:2, B:2, C:2
 x:7 => risultato a video: A:3, B:2, C:2
 x:8 => risultato a video: A:3, B:3, C:2
 x:9 => risultato a video: A:3, B:3, C:3
Suggerimenti:
- usare gli operatori / e % tra interi
- si operi in due passaggi:
  . prima si diano a ciascuno x / 3 monete
  . poi resteranno y = x % 3 monete, pari a 0 o 1 o 2:
   C non riceve comunque altre monete,
   B riceve ora 1 moneta solo se y vale 2, e cio' corrisponde alla divisione intera per 2 di y
   A riceve un numero di monete pari alle y restanti meno quelle gia' date a B
******************/

import java.util.*;

public class Distribuisci {

	public static void main (String[] args) {
		
		int X;
		
		int A = 0;
		int B = 0;
		int C = 0;
		
		int resto;
		int tmp;
		
		Scanner kb = new Scanner (System.in);
		
		
		System.out.println ("Inserisci Un Numero Compreso Tra 1 e 9: ");
		X = kb.nextInt();
		kb.nextLine();
		
		tmp = X / 3;
		
		System.out.println("X/3 = " + tmp);
		
		A += tmp;
		B += tmp;
		C += tmp;
		
		resto = X % 3;
		
		System.out.println("X%3 = " + resto);
		
		if (resto==1) {
		
			A++;
			
		}
		
		if (resto==2) {
		
			A++;
			B++;
		}
		
		System.out.print ("X: " + X + " ==) ");
		
		System.out.print ("A: " + A + " - ");
		
		System.out.print ("B: " + B + " - ");
		
		System.out.print ("C: " + C);
		
		System.out.println ("");

	}
	
}