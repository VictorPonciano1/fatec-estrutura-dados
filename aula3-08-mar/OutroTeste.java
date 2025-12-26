import java.util.Random;
public class OutroTeste {
    public static void main(String[] args) {
        NossoVetor v = new NossoVetor(6);
        // try {
        //     System.out.println(v.remove());
        // }
        // catch (RuntimeException e) {
        //     System.out.println(e.getMessage());
        // }
        // System.out.println("passou");
        Random random = new Random();
        for (int i=1; i<=100; i++) {
            if (random.nextBoolean()) {
                v.inserir(i);
                System.out.println("inseriu " + i);
            }
            else {
                try {
                    System.out.println(v.remove() + " foi removido");
                }
                catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.println(v);
            System.out.println("tamanho = " + v.getTamanho());
        }
        // int pos = v.indiceDe(40);
        // if (pos == -1) {
        //     System.out.println("40 nao foi encontrado");
        // }
        // else {
        //     System.out.println("40 foi encontrado na posicao" + pos);
        // }
        try {
            System.out.println("40 esta na posicao " + v.indiceDe(40));
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
