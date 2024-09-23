package estudo;
import java.util.Locale;

public class DeclarandoVariaveis {
    public static void main(String[] args) {
        
        double x = 10.35784;

        //Sem formatação
        System.out.println(x);

        //Com formatação
        System.out.printf("%.2f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);
        System.out.println("RESULTADO: " + x + " METROS");
        System.out.printf("RESULTADO: %.2f METROS%n" , x );
        
    }
}
