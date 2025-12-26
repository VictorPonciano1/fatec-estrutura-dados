/* CONSTRUIR UM METODO PARA CADA UMA DAS TAREFAS A SEGUIR: 
 * A) ENCONTRAR O MAIOR ELEMENTO DA LISTA;
 * B) INSERIR UM ELEMENTO QUALQUER NUMA POSICAO DEFINIDA;
 * C) REMOVER UM ELEMENTO ESPECIFICO;
 * D) REOMVER UM ELEMENTO DE UMA POSICAO ESPECIFICA;
 * E) VERIFICAR SE UM ELEMENTO "X" ESTA NA LISTA (BOOLEANA);
 * F) VERIFICAR O NUMERO DE OCORRENCIAS DE UM ELEMENTO "X" NA LISTA;
 * G) CRIAR UMA LISTA COM TODAS AS POSICOES QUE O ELEMENTO "X" APARECE;
*/

public class ListaLigada {
    
    private No topo;
    private No utlimo;

    // CONSTRUTOR PADRAO: ZERA TUDO

    public boolean listaVazia() { //emptyList
        return topo == null;
    }

    // INSERE ELEMENTOS PELO INICIO DA LISTA
    public void insereInicio(int info) {
        No novo = new No(info);

        if (listaVazia()) {
            utlimo = novo;
        } else {
            novo.setProximo(topo);
        }
        topo = novo;
    }

    //PARA CONSTRUIR O TOSTRING, VARREMOS A LISTA DO topo ATE O FINAL
    @Override
    public String toString() {
        
        if (listaVazia()) return "lista vazia";
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
        
        if (listaVazia()) return 0;
        int contador = 0;

        No runner = topo;
        
        while (runner != null) {
            contador++;
            runner = runner.getProximo(); 
        }
        return contador;
    }

    // REMOVE ELEMENTO PELO INICIO
    public int removeInicio() {

        if (listaVazia()) {
        throw new RuntimeException("falha na remocao do inicio");    
        }
        int temp = topo.getInfo();
        topo = topo.getProximo();

        if (topo == null) { //ESVAZIOU A LISTA
            utlimo = null;
        }
        return temp;
    }

    // INSERE ELEMENTO PELO FIM DA LISTA (SE A LISTA FOR VAZIA)
    public void inseeFim(int info) {
       
        No novo = new No(info);
       
        if (listaVazia()) {
            topo = novo;
        } else {
            utlimo.setProximo(novo);
        }
        utlimo = novo;
    }

    // REMOVE ELEMENTOS PELO FIM DA LISTA
    public int removeFim() {
        if (listaVazia()) {
        throw new RuntimeException("falha na remocao do inicio");
        }
        int temp = utlimo.getInfo();
        
        // SEMPRE PRIVILEGIE A EFICIENCIA
        if (topo == utlimo) { // TEM UM UNICO ELEMENTO
            topo = null;
            utlimo = null;
        } else {
            No runner = topo;

            while (runner.getProximo() != utlimo) { // PROCURAMOS O PENULTIMO
                runner = runner.getProximo();
            }

            runner.setProximo(null);
            utlimo = runner;
        }

        return temp;
    } 
}
