package estudo;
import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String dia;

        switch (x) {
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Valor inválido";
                break;
        }

        System.out.println("Dia da semana: " + dia);

        sc.close();
    }
}
