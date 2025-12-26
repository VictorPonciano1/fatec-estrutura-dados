import java.util.Random;

public class MergeFilas 
{
    public static void main(String[] args) 
    {
        Random rand = new Random();
        FilaLigada<Integer> filaA = new FilaLigada<>();
        FilaLigada<Integer> filaB = new FilaLigada<>();
        FilaLigada<Integer> filaC = new FilaLigada<>();

        int sizeA = rand.nextInt(1,6);
        int sizeB = rand.nextInt(1,6);

        for (int i = 0; i < sizeA; i++) {
            filaA.enfileirar(rand.nextInt(0, 11));
        }

        for (int i = 0; i < sizeB; i++) {
            filaB.enfileirar(rand.nextInt(0, 11));
        }

        System.out.println("Fila A: " + filaA);

        System.out.println("Fila B: " + filaB);

        while (!filaA.filaVazia()) {
            filaC.enfileirar(filaA.desenfileirar());
        }
        while (!filaB.filaVazia()) {
            filaC.enfileirar(filaB.desenfileirar());
        }
        
        System.out.println("\nFila A: " + filaA);

        System.out.println("Fila B: " + filaB);

        System.out.println("\n" + "Fila C: " + filaC);    
    }
}