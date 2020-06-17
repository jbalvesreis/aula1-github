package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		// Suponha que a opera��o de saque possui uma taxa no valor de 5.0. Entretando, se a 
		// conta for do tipo poupan�a esta taxa nao deve ser cobrada.
		// Sobrescrevendo o m�todo withdraw na subclasse SavingsAccount
		// Super = � poss�vel chamar a implementa��o da superclasse usando a palavre super
		
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
