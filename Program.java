package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account = new Account();
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char question = sc.next().charAt(0);
		
		if (question == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDepoist = sc.nextDouble();
			account = new Account(number, holder, initialDepoist);
		}
		else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.depositValue(depositValue);
		
		System.out.println();
		System.out.println("Updated data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		account.withdrawValue(withdraw);
		System.out.println("Updated data:");
		System.out.println(account);
		
		sc.close();
	}

}
