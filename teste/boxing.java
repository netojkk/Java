package teste;

public class boxing {
    public static void main(String[] args) {
        int x = 20; 
        
        Object obj = x; // boxing

        int y = (int) obj; // unboxing

        System.out.println("resultado do y:"+y);
        System.out.println("resultado do x:"+x);
        

    }
}
