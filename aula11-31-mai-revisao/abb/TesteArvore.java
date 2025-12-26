import java.util.Random;

public class TesteArvore {
    public static void main(String[] args) {
        Random r = new Random();
        ArvoreBinaria abb = new ArvoreBinaria();

        try {
            System.out.println(abb.maior() + " e maior");
        }
        catch (RuntimeException rt) {
            System.out.println(rt.getMessage());
        }
        for (int i=1; i<=12000; i++) {
            int n = r.nextInt(12000);
            //System.out.println(n + " ");
            abb.insere(n);
        }
        System.out.println("\n" + abb);
        System.out.println("altura: " + abb.altura());
        System.out.println("numero de nos: " + abb.contaNos());

        System.out.println(abb.busca(10) ? "10 esta na arvore" : "10 nao esta na arvore");

        try {
            System.out.println(abb.maior() + " e maior");
        }
        catch (RuntimeException rt) {
            System.out.println(rt.getMessage());
        }
    }
}
