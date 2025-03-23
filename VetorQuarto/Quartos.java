
import entities.Client;

import java.util.Scanner;
public class Quartos {
    public static void main(String[] args) {
        
        Client[] quartos = new Client[10];
        Scanner input = new Scanner(System.in);

        // ask how many rooms will be rented
        System.out.println("How many rooms will be rented? ");
        int n = input.nextInt();

        // one for loop to ask the name and email of the client
        for(int i = 0; i < n; i++) {
            System.out.println("Rent #" + (i + 1) + ":");
            System.out.print("Name: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.print("Email: ");
            String email = input.nextLine();
            System.out.print("Room: ");
            int room = input.nextInt();

            quartos[room] = new Client(name, email);
            System.out.println();
        }
        
        System.out.println("Busy rooms: ");
        for(int i = 0; i < quartos.length; i++) {
            if(quartos[i] != null) {
                System.out.println(i + ": " + quartos[i]);
            }
        }
        input.close();
    }
    
}
