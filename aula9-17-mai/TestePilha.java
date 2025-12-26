import java.util.Random;

public class TestePilha {
    public static void main(String[] args) {
        
        Pilha pilha = new Pilha();
        Random random = new Random();

        do {
            if (random.nextBoolean()) {
                pilha.push(random.nextInt(10));
            } else {
                try {                
                    System.out.println(pilha.pop() + " foi desempilhado");
                } catch (RuntimeException runtimeException) {
                    System.out.println(runtimeException.getMessage());
                }
            }            
            System.out.println(pilha);
        } while (!pilha.pilhaVazia());
        
    }
}
