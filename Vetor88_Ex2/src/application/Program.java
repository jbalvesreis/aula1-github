package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		/* Problema exemplo 2
		 * Fazerm um programa para ler um numero inteiro N e is dados (nome e preço)
		 * de N Produtos. Armazene os N produtos em um vetor.
		 * Em seguida, mostra o preço médio dos produtos.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for (int i=0; i<vect.length; i++ ) {
			sc.nextLine();
			System.out.println("Produto: ");
			String name = sc.nextLine();
			System.out.println("Preço: ");
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		for (int i=0; i< vect.length; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum / vect.length;
		System.out.println("Soma:" + sum);
		System.out.printf("Average Price = %.2f%n", avg);
		System.out.println("---------------------------------------");
		
		sc.close();
	}

}
