package estudo;
import java.util.Scanner;
import java.util.Locale;

public class ExemploDeScanner {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        String x = sc.next();
        int y = sc.nextInt();
        double z = sc.nextDouble();

        System.out.println("Você digitou: " + x);
        System.out.println("Você digitou: " + y);
        System.out.println("Você digitou: " + z);

        sc.close();
    }
}   