
public class TipiVariabiliDue {

	public static void main(String[] args) {

		String line = "ciao mondo";
		int a;
		char b;
		char c;
		String d = new String();
		String e;

		a = line.length();

		b = line.charAt(0); 

		c = line.charAt(a-1);

		d = line.substring(0,1).toUpperCase();

		e = line.substring(a-1,a).toUpperCase();

		System.out.println("La linea e' lunga: " + a);
		System.out.println("Il primo carattere di " + line + " e' : " + b);
		System.out.println("L'ultimo carattere di " + line + " e' : " + c);
		System.out.println("Il primo carattere in maiuscolo e': " + d);
		System.out.println("L'ultimo carattere in maiuscolo e': " + e);
		
		}

}

