import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a distância percorrida em quilômetros:");
        double distancia = scanner.nextDouble();

        System.out.println("Digite o tempo de espera em minutos:");
        int tempoEspera = scanner.nextInt();

        System.out.println("Digite a tarifa base:");
        double tarifaBase = scanner.nextDouble();

        System.out.println("Digite o fator de demanda:");
        double fatorDemanda = scanner.nextDouble();

        Uber uber = new Uber(distancia, tempoEspera, tarifaBase, fatorDemanda);
        uber.exibirDetalhesCorrida();
    }
}