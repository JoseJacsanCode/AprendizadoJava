package exercicios;

public class TesteLampada {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.modelo = "A60";
        lampada.pontencia = 20;
        lampada.voltagem = "Bivolt";
        lampada.peso = 115.0;

        System.out.println(lampada.modelo);
        System.out.println(lampada.pontencia);
        System.out.println(lampada.voltagem);
        System.out.println(lampada.peso);

        lampada.ligar();
        lampada.mostrarEstado();

        lampada.desligar();
        lampada.mostrarEstado();

    }
}
