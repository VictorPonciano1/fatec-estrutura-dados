import java.util.Random;

public class TesteArvore {
    public static void main(String[] args) {
        Random rand = new Random();
        ArvoreBinaria ab = new ArvoreBinaria();

        /*for (int i = 1; i <= 12; i++) 
        {
            int n = rand.nextInt(10, 60);
            System.out.print(n + " added ");

            ab.insere(n);
        }*/
        ab.insere(10);
        ab.insere(2);
        ab.insere(40);
        ab.insere(1);
        ab.insere(5);
        ab.insere(13);
        ab.insere(45);

        System.out.println();
        System.out.println("\n" + ab);
        System.out.println("altura: " + ab.altura());
        System.out.println("numero de nos: " + ab.contaNos());
    }
}