package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		/* Laço "for each"
		 * Sintaxe opcional simplificada para percorrer coleções
		 * Sintaxe:
		 * for (tipo apelido:coleção){
		 * 		<comando 1>
		 * 		<comando 2>
		 * }
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		for (int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		System.out.println("............Usando for each...................");
		
		//Usando for each
		for (String obj:vect) {
			System.out.println(obj);
		}
	
		sc.close();
	}

}
