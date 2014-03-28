/*******************************
  Si scriva un programma in Java che:
  1) Accetti in input "alcune stringhe" come parametri da linea di comando
  2) Per ogni singola stringa ricevuta in input:
     2.a) crei la "circolarizzazione" della stringa
     2.b) stampi a video le stringhe così ottenute

Note e Suggerimenti:
1) I parametri da linea di comando sono i parametri del metodo main (String[] args) che
  e', appunto, un array di stringhe. Si faccia attenzione a controllare che l'array 
  NON sia vuoto (con opportuna verifica della sua lunghezza).
  Gli studenti che hanno precedenti competenze con il lunguaggio C facciano
  attenzione poiche' ci sono alcune importanti differenze tra C e Java 
  in questo caso (a voi scoprirle :-).
    
2) Per "circolarizzazione" della stringa si intende che data
   ad esempio la stringa "ciao" si hanno le seguenti stringhe:
	ciao
	iaoc
	aoci
	ocia

*********************************/


public class StringheCircolari {

	public static void main (String[] args) {
	
		if ( args.length < 1 ) { System.exit(1); }
		
		for (int i = 0; i<args.length; i++) {
		
			circolizza(args[i]);
		
		}
		
	}

	public static void circolizza (String str) {
	
		System.out.println ("\n[*] " + str);
		
		for ( int i = 0; i<(str.length()-1); i++) { 
		
			str = str.substring(1,str.length()) + str.substring(0,1); 
			System.out.println (str); 
			
		}
		
	}
	
}