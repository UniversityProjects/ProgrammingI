import java.util.*;

public class MediaTreNumeri {

 	public static void main (String[] args) {

		Scanner tastiera = new Scanner(System.in);
    
		int n1;
		int n2;
		int n3;

    	double media;

    	System.out.println ("Introdurre il primo   numero intero:");
    	n1 = tastiera.nextInt();

    	System.out.println ("Introdurre il secondo numero intero:");
		n2 = tastiera.nextInt();

    	System.out.println ("Introdurre il terzo   numero intero:");
		n3 = tastiera.nextInt();

    	System.out.println ("");

    	media = ((double)(n1 + n2 + n3))/3;

    	System.out.println("La media dei tre numeri e': " + media);
  
	}

}
