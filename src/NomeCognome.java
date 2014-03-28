import java.util.Scanner;

/*****************
  Scrivete un programma Java che:
  - Chieda all'utente nome e cognome (con opportuni messaggi utente);
  - Stampi a video nome e cognome (separati da uno spazio) con le iniziali in maiuscolo (anche se l'utente
    le ha scritte in minuscolo).

  Aiuti: Per effettuare l'input utente utilizzate due volte il metodo nextLine() della classe Scanner, 
  del tutto equivalente al metodo nextInt(); il metodo ritorna, appunto, una stringa di caratteri.
  Utilizzate i metodi opportuni della classe String visti a lezione per ottenere le iniziali in maiuscolo.
  ****************/
  

public class NomeCognome {

	public static void main (String[] args) {
	
		String nome;
		String cognome;
		
		int nome_length;
		int cognome_length;
		
		String nome_iniziale;
		String cognome_iniziale;
		
		Scanner kb = new Scanner (System.in);
		
		System.out.println ("[*] Inserisci Il Tuo Nome: ");
		nome = kb.nextLine();
		
		System.out.println ("");
		
		System.out.println ("[*] Inserisci Il Tuo Cognome: ");
		cognome = kb.nextLine();
	
		nome_length = nome.length();
		nome_iniziale = nome.substring(0,1).toUpperCase();
				
		cognome_length = cognome.length();
		cognome_iniziale = cognome.substring(0,1).toUpperCase();
		
		System.out.println ("");
		
		System.out.println (nome_iniziale + nome.substring(1,nome_length) + "   " + cognome_iniziale + cognome.substring(1,cognome_length));
		
	
	}
	
}