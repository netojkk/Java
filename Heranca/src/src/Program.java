package src;

import entities.Account;
import entities.BusinnesAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Account acc1 = new Account(1001, "Maria", 1000.0);
		acc1.withdraw(100.0);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount(1002, "Alex", 1000.0, 0.01);
		acc2.withdraw(100.0);
		
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinnesAccount(1003, "Roberto", 1000.0, 500.0);
		acc3.withdraw(200);
		
		System.out.println(acc3.getBalance());
		
	
		
		
	}

}
