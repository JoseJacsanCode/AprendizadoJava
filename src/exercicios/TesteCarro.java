package exercicios;

public class TesteCarro {
    public static void main (String[] args) {
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;
        
        System.out.println(van.marca);
        System.out.println(van.modelo);

        van.exiberAutonomia(); // método simples
        double autonomia = van.obterAutonomia();
        System.out.println(autonomia);

        double qtdCombustivel10 = van.calcularCombustivel(10);
        System.out.println(qtdCombustivel10);

        double qtdCombustivel15 = van.calcularCombustivel(15);
        System.out.println(qtdCombustivel15);
    }
}
