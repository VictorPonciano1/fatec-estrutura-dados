import java.util.Scanner;

public class TesteVetor {
    public static void main(String[] args) {
        NossoVetor v1;
        System.out.println("qual o tamanho do vetor?");
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        v1 = new NossoVetor(t);
        //v1.ocupacao = 35; nãããão, está encapsulado
        NossoVetor v2 = new NossoVetor();

        int i = 1;
        while (!v1.estaCheio()) {
            System.out.println(i);
            v1.inserir(i++);  
        }
        // i = 1;
        // while (v2.inserir(i)) {
        //     System.out.println(i++);  
        // }
        System.out.println(v1);
        System.out.println(v2);

        v1.inserir(100);
        scanner.close();
    }
}
