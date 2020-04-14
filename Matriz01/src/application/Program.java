package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/* Aula 95
		 * Matrizes
		 * - Em programação, Matriz é o nome dado a arranjos bidimensionais
		 * - atenção: “vetor de vetores”
		 * - Arranjo (array) é uma estrutura de dados:
		 *   homogenea, ordenada e alocada de uma vez só em um bloco contiguo de memoria
 		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [][] mat = new int [n][n];
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat [i][j] = sc.nextInt();
			}
		}
		
		
		System.out.println("-----Main Diagonal -----------");
		
		for (int i=0; i<mat.length; i++) {
			System.out.println(mat [i][i] + " ");
		}
		
		System.out.println("-----Quantidade Negativos-----");
		int count = 0;
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}
		
		System.out.println("Negative numbers = " + count);
		
		sc.close();
		
	}

}
