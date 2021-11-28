package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char resposta = sc.next().charAt(0);
		
		Account account;
		double valor;
		
		if (resposta == 'y') {
			System.out.println("Enter initial deposit value: ");
			valor = sc.nextDouble();
			account = new Account(number, holder, valor);
		}
		else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account.toString());

		System.out.print("Enter a deposit value: ");
		valor = sc.nextDouble();
		account.deposito(valor);
		System.out.println("Updated data:");
		System.out.println(account.toString());
		
		System.out.print("Enter a withdraw value: ");
		valor = sc.nextDouble();
		account.saque(valor);
		System.out.println("Updated data:");
		System.out.println(account.toString());
		
		sc.close();
	}

}
