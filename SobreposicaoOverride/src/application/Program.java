package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		// Suponha que a operação de saque possui uma taxa no valor de 5.0. Entretando, se a 
		// conta for do tipo poupança esta taxa nao deve ser cobrada.
		// Sobrescrevendo o método withdraw na subclasse SavingsAccount
		// Super = É possível chamar a implementação da superclasse usando a palavre super
		
		Account acc1 = new Account(1001, "Alex", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
			
		Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
	}

}
