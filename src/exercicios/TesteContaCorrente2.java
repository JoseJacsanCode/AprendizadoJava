package exercicios;

public class TesteContaCorrente2 {
    public static void main(String[] args) {
        ContaCorrente2 contaCorrente = new ContaCorrente2();
        contaCorrente.agencia = "1538";
        contaCorrente.numero = "25689-3";
        contaCorrente.saldoConta = 355.90;
        contaCorrente.especial = false;

        System.out.println(contaCorrente.agencia);
        System.out.println(contaCorrente.numero);
        System.out.println("R$ " + contaCorrente.saldoConta);
        System.out.println(contaCorrente.especial);
    }
}
