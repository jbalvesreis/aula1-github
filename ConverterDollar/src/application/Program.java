package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* TODO Auto-generated method stub
		 * Fa�a um programa para ler a cota��o do d�lar, e depois um valor em d�lares a ser comprado
		 * por uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos d�lares considerando
		 * ainda que a pessoa ter� que pagar 6% de IOF sobre o valor em s�lar. Criar uma classe
		 * CurrencyConvert para ser respons�vel pelos calculos.
		 * Exemplo: What is the dollar price? 3.10
		 * How many dollars will be bougtht? 200.00
		 * Amount to be paid in reais = 657.20
        */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o valor atual do dolar:");
		CurrencyConverter.priceDollar = sc.nextDouble();
		System.out.print("Insira a quantidade de dolares:");
		CurrencyConverter.qnttDollar = sc.nextDouble();
		System.out.printf("Valor a ser pago em dolares: %.2f%n", CurrencyConverter.valTotalDollar());
		
		sc.close();

	}

}
