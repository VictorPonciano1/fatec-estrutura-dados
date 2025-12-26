/* CONSTRUIR UM METODO PARA AS TAREFAS QUE ESTÃO COMENTADAS.
 * AVISO: PELO VISTO ALGO NA CLASSE DEU ERRO.
*/

public class Pilha {
    
    private No topo;

    // CONSTRUTOR EH O PADRAO: ZERA TUDO
    public boolean pilhaVazia() { //emptyList
        return topo == null;
    }

    // INSERE ELEMENTOS PELO INICIO DA LISTA
    public void push(int info) {
        No novo = new No(info);
        novo.setProximo(topo);
        topo = novo;
    }

    //PARA CONSTRUIR O TOSTRING, VARREMOS A LISTA DO topo ATE O FINAL
    @Override
    public String toString() {
        
        if (pilhaVazia()) return "lista vazia";
        String s = "";    

        No runner = topo;
        
        while (runner != null) {
            s += runner + " -> ";
            runner = runner.getProximo(); 
        }
        return s + "\\\\";
    }
    
    // TAMANHO DA LISTA
    public int tamanho() {
        
        if (pilhaVazia()) return 0;
        int contador = 0;

        No runner = topo;
        
        while (runner != null) {
            contador++;
            runner = runner.getProximo(); 
        }
        return contador;
    }

    // REMOVE ELEMENTO PELO INICIO
    public int pop() {

        if (pilhaVazia()) {
            throw new RuntimeException("falha na remocao do inicio"); //MENSAGEM DE ERRO
        }
        int temp = topo.getInfo();
        topo = topo.getProximo();
        return temp;
    }

    // A) ENCONTRAR O MAIOR NÚMERO


    // B) INSERIR UM ELEMENTO QUALQUER NUMA POSICAO DEFINIDA


    // C) REMOVER UM ELEMENTO ESPECIFICO


    // D) REOMVER UM ELEMENTO DE UMA POSICAO ESPECIFICA


    // E) VERIFICAR SE UM ELEMENTO "X" ESTA NA LISTA (BOOLEANA)


    // F) VERIFICAR O NUMERO DE OCORRENCIAS DE UM ELEMENTO "X" NA LISTA


    // G) CRIAR UMA LISTA COM TODAS AS POSICOES QUE O ELEMENTO "X" APARECE
}
