package exercicios;

import java.util.Scanner;
import java.util.Locale;

public class Peca {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int codePecas1 = sc.nextInt();
        int qntdPecas1 = sc.nextInt();
        double valorPecas1 = sc.nextDouble();

        int codePecas2 = sc.nextInt();
        int qntdPecas2 = sc.nextInt();
        double valorPecas2 = sc.nextDouble();

        double valorDasPecas = (qntdPecas1 * valorPecas1) + (qntdPecas2 * valorPecas2);

        System.out.println("Código das peças: " + codePecas1 + " e " + codePecas2);
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorDasPecas);

        sc.close();
    }
}


/*
 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
 * valor unitário de cada peça 1, o
 * código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
 * Calcule e mostre o valor a ser pago.
 * 
 * Entrada:
 * 12 1 5.30
 * 16 2 5.10
 * Saída:
 * VALOR A PAGAR: R$ 15.50
 * 
 * Entrada:
 * 13 2 15.30
 * 161 4 5.20
 * Saída:
 * VALOR A PAGAR: R$ 51.40
 * 
 * Entrada:
 * 1 1 15.10
 * 2 1 15.10
 * Saída:
 * VALOR A PAGAR: R$ 30.20
 */
