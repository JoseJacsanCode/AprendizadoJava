package exercicios;

public class Exer05 {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();

        contaCorrente.agencia = "4568";
        contaCorrente.numero = "15385-0";
        contaCorrente.saldoConta = 53.85;
        contaCorrente.especial = false;


        System.out.println(contaCorrente.agencia);
        System.out.println(contaCorrente.numero);
        System.out.println(contaCorrente.saldoConta);
        System.out.println(contaCorrente.especial);
        
        

    }
}
