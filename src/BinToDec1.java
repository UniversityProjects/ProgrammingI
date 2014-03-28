import java.util.Scanner;

/***********************************
  Si scriva un programma in Java che:
  - chiede all'utente un numero binario di tre cifre (es. 101) utilizzando il metodo nextLine() (il metodo ritorna una stringa);
  - converte il numero binario in numero decimale.
  Stampare messaggi opportuni per l'utente.

  Suggerimenti e indicazioni:
  Si usino i metodi appropriati della classe String per estrarre le singole cifre binarie.
  Per effettuare la conversione bisogna ricordare che i caratteri (i.e., tipo primitivo char)
  sono memorizzati come numeri interi (secondo la codifica UNICODE) e in Java percio' 
  e' permesso l'uso di operatori aritmetici +  e - tra caratteri.
  *******************/



public class BinToDec1 {
  
	public static void main (String[] args) {
	
		String numero_bin;
		int numero_dec;
		
		int bin_1;
		int bin_2;
		int bin_3;
		
		char zero = '0';
		
		Scanner kb = new Scanner (System.in);
		
		System.out.println ("Inserisci Un Numero Binario Di 3 Cifre: ");
		numero_bin = kb.nextLine();
		
		bin_1 = 2*2*((int)(numero_bin.charAt(0))-(int)zero);
				
		bin_2 = 2*((int)(numero_bin.charAt(1))-(int)zero);
				
		bin_3 = (int)numero_bin.charAt(2)-(int)zero;
				
		numero_dec = bin_1 + bin_2 + bin_3;
		
		System.out.println (numero_bin + " ==] " + numero_dec);
  
  
    }
  
}
