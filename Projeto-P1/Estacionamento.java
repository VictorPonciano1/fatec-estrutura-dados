import java.util.Scanner;

public class Estacionamento {
    private static final int CAPACIDADE = 10;
    private static Pilha estacionamento = new Pilha(CAPACIDADE);
    private static Pilha rua = new Pilha(CAPACIDADE);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Digite 0 para entrada, 1 para saída e a placa do carro:");
            int operacao = sc.nextInt();
            String placa = sc.next();

            if (operacao == 0) {
                chegadaCarro(placa);
            } else if (operacao == 1) {
                saidaCarro(placa);
            } else {
                System.out.println("Operação inválida!");
            }
        }
    }

    private static void chegadaCarro(String placa) {
        Carro carro = new Carro(placa);
        if (!estacionamento.isCheia()) {
            estacionamento.push(carro);
            System.out.println("Carro " + placa + " estacionou.");
        } else {
            System.out.println("Estacionamento lotado. Carro " + placa + " não entrou.");
        }
    }

    private static void saidaCarro(String placa) {
        if (estacionamento.contains(placa)) {
            while (!estacionamento.isVazia() && !estacionamento.peek().getPlaca().equals(placa)) {
                Carro carroManobrado = estacionamento.pop();
                rua.push(carroManobrado);
            }

            if (!estacionamento.isVazia()) {
                Carro carroRetirado = estacionamento.pop();
                System.out.println("Carro " + placa + " saiu. Manobras: " + carroRetirado.getManobras());
            }

            while (!rua.isVazia()) {
                Carro carro = rua.pop();
                carro.setManobras(carro.getManobras() + 1);
                estacionamento.push(carro);
            }
        } else {
            System.out.println("Carro " + placa + " não está no estacionamento.");
        }
    }
}
