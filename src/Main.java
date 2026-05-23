import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        System.out.println("Favor informe o consumo médio do veículo (km/l):");
        double consumoMedio = tc.nextDouble();

        System.out.println("Favor informe a capacidade do tanque (litros):");
        double capacidadeTanque = tc.nextDouble();

        System.out.println("Favor informe o combustível atual no tanque (litros):");
        double combustivelAtual = tc.nextDouble();

        System.out.println("Favor informe a distância da viagem (km):");
        double distanciaViagem = tc.nextDouble();

        double autonomiaMaxima = consumoMedio * capacidadeTanque;
        double autonomiaAtual = consumoMedio * combustivelAtual;

        System.out.printf("Autonomia máxima do veículo: %.1f km%n", autonomiaMaxima);
        System.out.printf("Autonomia atual: %.1f km%n", autonomiaAtual);

        if (autonomiaAtual >= distanciaViagem) {
            System.out.println("Você conseguirá completar a viagem sem precisar abastecer.");
        } else {
            System.out.println("Atenção! Você precisará abastecer antes de concluir a viagem.");
        }

        tc.close();
    }
}