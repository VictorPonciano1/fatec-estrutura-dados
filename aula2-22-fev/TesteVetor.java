import java.util.Scanner;

public class TesteVetor {
    public static void main(String[] args) {
        
        NossoVetor v1;
        System.out.println("Qual o tamanho do vetor");

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        v1 = new NossoVetor(t);

        // QUANDO "VAZIO" POSSUI O TAMANHO INICIAL 10
        NossoVetor v2 = new NossoVetor();
        
        //JEITO DE ESCREVER 1
        int i = 1;
        while (!v1.estaCheio()) {
            System.out.println(i);
            v1.Inserir(i++);
        }

        // JEITO 2
        i = 1;
        while (v2.Inserir(i)) {
            System.out.println(i++);
        }

        scanner.close();
    }
}
