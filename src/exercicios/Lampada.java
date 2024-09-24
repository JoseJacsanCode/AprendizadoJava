package exercicios;

public class Lampada {
    String modelo;
    int pontencia;
    double peso;
    String voltagem;
    boolean ligada;

    void ligar() {
        ligada = true;
    }

    void desligar() {
        ligada = false;
    }

    void mostrarEstado() {
        if(ligada) {
            System.out.println("A lâmpada está ligada");
        }
        else {
            System.out.println("A lâmpada está desligada");
        }
    }

    void mudarEstado() {
        if (ligada) {
            desligar();
        }
        else {
            ligar();
        }
    }
 
}

/*
 * Escreva	uma classe para	representar	uma	lâmpada. Desenvolva	métodos	
 * para	ligar,	desligar	a	lampada.
 */