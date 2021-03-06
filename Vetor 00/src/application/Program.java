package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/* Vetores:
		 * Em Programa��o "vetor" � o nome dado a arranjos unidimensionais
		 * Arranjo (array) � uma estrutura de dados:
		 * - homog�nea (dados do mesmo tipo)
		 * - Ordenada (elementos acessados por meio de posi��es)
		 * 0 alocada de uma vez s�, em bloco cont�guo de mem�ria
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double [] vect = new double[n];
		
		for (int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
			for (int i=0; i<n; i++) {
			sum += vect[i];
		}
		double avg = sum / n;
						
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println("Soma: " + sum);
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
		
		System.out.println("------------------------------");
		
		
		
		
		sc.close();
	}

}
