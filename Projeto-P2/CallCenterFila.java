import java.util.Random;

public class CallCenterFila 
{
    public static void main(String[] args) 
    {
        Random rand = new Random();
        FilaLigada<Chamada> filaChegada = new FilaLigada<>();
        
        for (int i = 0; i < 15; i++) {
            filaChegada.enfileirar( new Chamada(rand.nextInt(10, 100), rand.nextInt(1,4)) );
        }

        System.out.println();
        System.out.println(filaChegada);

        FilaLigada<Chamada> fila1 = new FilaLigada<>();
        FilaLigada<Chamada> fila2 = new FilaLigada<>();
        FilaLigada<Chamada> fila3 = new FilaLigada<>();

        while (!filaChegada.filaVazia()) 
        {
            Chamada pessoa = filaChegada.desenfileirar();

            switch (pessoa.getPrioridade()) 
            {
                case 1:
                    fila1.enfileirar(pessoa);
                    break;

                case 2:
                    fila2.enfileirar(pessoa);
                    break;

                case 3:
                    fila3.enfileirar(pessoa);
                    break;
            }
        }

        System.out.println(fila1);
        System.out.println(fila2);
        System.out.println(fila3);
    }
}