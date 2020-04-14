package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Feito uma Soma adicional que pode eliminar o ultimo FOR
		// Mas, o exemplo do FOR � para atender uma necessidade de somar o Vetor! 
		/* Checklist
		 * Revis�o do conceito vetor
		 * Declaracao de instancia��o
		 * Manipulacao de vetor de elementos tipo valor(tipo primitivo)
		 * Manipula��o de vetor de elementos tipo refer�ncia(classe)
		 * Acesso aos elementos
		 * Propriedade length
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		double soma = 0.0;
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			soma += price;
			vect[i] = new Product(name, price);
		}
		
		double avg2 = soma / vect.length;
		System.out.printf("Op��o2 de resultado: %.2f%n", avg2);
			
		double sum = 0.0;
		for (int i=0; i<vect.length; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum / vect.length;
		
		System.out.printf("AVARAGE HEIGHT: %.2f%n", avg);
		
		
		sc.close();
	}

}
