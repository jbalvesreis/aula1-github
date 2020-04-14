package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* TODO Auto-generated method stub
		 * Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado
		 * por uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares considerando
		 * ainda que a pessoa terá que pagar 6% de IOF sobre o valor em sólar. Criar uma classe
		 * CurrencyConvert para ser responsável pelos calculos.
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
