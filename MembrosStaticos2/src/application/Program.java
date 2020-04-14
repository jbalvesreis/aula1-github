package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {

	public static void main(String[] args) {
		//  
		// Métodos na própria classe do programa
		// Nota: dentro de um método estático vc não pode chamar membros de instancia da mesma classe.
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator();
		
		
		System.out.print("Enter radius:");
		double radius = sc.nextDouble();
		
		double c = calc.circumference(radius);
		
		double v = calc.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI: %.2f%n", calc.PI);
		
		sc.close();
	}
	
}
