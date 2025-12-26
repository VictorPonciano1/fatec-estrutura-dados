import PilhaVetor.Pilha;

public class PilhaToFila 
{
    public static void main(String[] args) 
    {
        Pilha stack = new Pilha();
        stack.canPush(11);
        stack.canPush(87);
        stack.canPush(97);
        stack.canPush(56);
        stack.canPush(74);
        System.out.println(stack);

        FilaLigada<Integer> fila = new FilaLigada<>();
        int desiredElement = 97;
        int pos = 0;
        int pilhaSize = stack.tamanho();




        for (int i = 0; i < pilhaSize; i++) 
        {
            if(stack.espiaCarta() != desiredElement)
            {
                fila.enfileirar(stack.canPop());
                pos++;
            }
        }

        if(stack.espiaCarta() != desiredElement && pos == 5){
            pos = -1;
        }

        System.out.println("Desired element's pos: " + pos);
        System.out.println(fila);

        System.out.println(stack);

        while (!stack.isVazia()) {
            fila.enfileirar(stack.canPop());   
        }

        Pilha auxPilha = new Pilha();
        while (!fila.filaVazia()) {
            auxPilha.canPush(fila.desenfileirar());    
        }

        while (!auxPilha.isVazia()) {
            stack.canPush(auxPilha.canPop());
        }

        System.out.println(stack);
    }
}