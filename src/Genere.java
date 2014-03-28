import java.util.Scanner;


/*
 Scrivere un programma che chiede all'utente una stringa simile alle seguenti:
 "la scatola sembra bella", 
"lo scoglio sembra brutto", cioe':
  art_lo_la spazio parola_con_finale_o_a spazio verbo spazio aggettivo_con_o_a
 (dove i caratteri sono tutti lettere alfabetiche, o spazi dove sopra indicato)

 
e che stampa a video:
 "frase corretta", se articolo parola e aggettivo sono
   tutti maschili o 
tutti femminili,
 "frase errata" in ogni altro caso, e in tal caso
   stampa anche il genere di ogni elemento: 
di articolo, parola, aggettivo
*/


public class Genere {

	public static void main (String[] args) {
	
		String string_in = new String();
		@SuppressWarnings("unused")
		String string_tmp = new String();
		char gen_art = '0';
		char gen_nom = '0';
		char gen_agg = '0';
		char lastchar_art;
		char lastchar_nom;
		char lastchar_agg;
		int space_1;
		int space_2;
		int length;
		
		Scanner kb = new Scanner (System.in);
		
		System.out.println ("Inserisci Una Frase: ");
		string_in = kb.nextLine();
		
		length = string_in.length();
		
		
		// Genere Articolo
		space_1 = string_in.indexOf(" ");
		lastchar_art = string_in.charAt(space_1 - 1);
		
		if (lastchar_art == 'o') { 
		
			gen_art = 'm'; 
			
		} else { 
		
			gen_art = 'f'; 
			
		}
		
		
		// Genere Nome
		string_tmp = string_in.substring (space_1+1,length);
		space_2 = string_in.indexOf(" ");
		lastchar_nom = string_in.charAt(space_2 - 1);
			
		if (lastchar_nom == 'o') { 
		
			gen_nom = 'm'; 
		
		} else { 
		
			gen_nom = 'f'; 
		
		}
		
		
		// Genere Aggettivo
		lastchar_agg = string_in.charAt(length - 1);
			
		if (lastchar_agg == 'o') { 
		
			gen_agg = 'm'; 
			
		} else { 
		
			gen_agg = 'f'; 
		
		}
		
		
		if ( (gen_art == gen_nom) && (gen_art == gen_agg) ) { 
		
		System.out.println ("Frase Corretta :)"); 
		
		} else { 
		
			System.out.println ("Frase Errata:");
			
			System.out.println ("Genere Articolo: " + gen_art);
			
			System.out.println ("Genere Nome: " + gen_nom);
			
			System.out.println ("Genere Aggettivo: " + gen_agg);			
	
	}
	
	}
	
}
