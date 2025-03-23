package src;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Product #" + (i+1) + " data:");
			System.out.print("Common, used or imported: (c/u/i)");
			char choice = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if (choice == 'u') {
				System.out.print("Manafacture Date: ");
				Date date = sdf.parse(sc.next());
				
				Product product = new UsedProduct(name, price, date);
				list.add(product);
			} 
			else if (choice == 'i') {	
				System.out.print("Customs Fee: ");
				double customsFee = sc.nextDouble();
				
				Product product = new ImportedProduct(name, price, customsFee);
				list.add(product);
			} 
			else if (choice == 'c') {		
				Product product = new Product(name, price);
				list.add(product);
			}
			else {
				System.out.println("ERROR!! Wrong type of product");
			}
	
		}
		
		System.out.println();
		System.out.println("Payments");
		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}
		
		sc.close();
	}

}
