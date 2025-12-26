public class TesteLista {
    public static void main(String[] args) {
        
        // LISTA
        ListaLigada lista = new ListaLigada();
        System.out.println(lista);

        // PERCORRENDO LISTA (ELEMENTOS PERCORREM DE 10 A 1 - ESTE FOR PERCORRE O INDICE E NAO O ELEMENTO)
        for (int i = 1; i <= 10; i++) {
            lista.insereInicio(i);
        }

        // TAMANHO INICIAL DA LISTA
        System.out.println(lista);
        System.out.println("Tamanho da lista: " + lista.tamanho());

        // REMOVENDO ELEMENTOS DA LISTA (INICIO)
        while (!lista.listaVazia()) {
            System.out.println(lista.removeInicio() + " saiu do inicio");
            System.out.println(lista);
        }

        System.out.println("Tmanho atual da lista: " + lista.tamanho());

        // INSERCAO DE FIM (ORDEM NUMERICA DOS ELEMENTOS - 1 A 10 - SE A LISTA FOR VAZIA)
        for (int i = 1; i <= 10; i++) {
            lista.inseeFim(i);
        }
        System.out.println(lista);
    
        // REMOVENDO PELO FIM DA LISTA
        while (!lista.listaVazia()) {
            System.out.println(lista.removeFim() + " saiu do fim");
            System.out.println(lista);
        }
        System.out.println("Tamanho apos a remocao: " + lista.tamanho());
    }
}
