package exercicios;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    //método simples
    void exiberAutonomia() {
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
    }

    double obterAutonomia() {
        System.out.println("O método obter autonomia foi chamado");
        double autonomia = capCombustivel * consumoCombustivel;
        return autonomia;
    }

    double calcularCombustivel(double km) {
        double qtdCombustivel = km / consumoCombustivel;
        return qtdCombustivel;
    }

}
