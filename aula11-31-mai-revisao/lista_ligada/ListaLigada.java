public class ListaLigada {
    private No primeiro;
    private No ultimo;
    //construtor é o padrão: zera tudo
    public boolean listaVazia() {
        return primeiro == null;
    }
    public void insereInicio (int info) {
        No novo = new No(info);
        if (listaVazia())
            ultimo = novo;
        else 
            novo.setProximo(primeiro);
        primeiro = novo;
    }
    //para construir o toString varremos a lista do primeiro até o final
    @Override
    public String toString () {
        if (listaVazia()) return "lista vazia";
        String s = "";
        No runner = primeiro;
        while (runner != null) {
            s += runner + " -> ";
            runner = runner.getProximo();
        }
        return s + "\\\\";
    }
    public int length () {
        if (listaVazia()) return 0;
        int cont = 0;
        No runner = primeiro;
        while (runner != null) {
            cont++;
            runner = runner.getProximo();
        }
        return cont;
    }
    public int removeInicio () {
        if (listaVazia()) 
            throw new RuntimeException("falha na remocao de inicio");
        int temp = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        if (primeiro == null) //esvaziou a lista
            ultimo = null;
        return temp;
    }
    public void insereFim (int info) {
        No novo = new No(info);
        if (listaVazia()) 
            primeiro = novo;
        else 
            ultimo.setProximo(novo);
        ultimo = novo;
    }
    public int removeFim() {
        if (listaVazia())
            throw new RuntimeException("falha na remocao de fim");
        int temp = ultimo.getInfo();
        if (primeiro == ultimo) {//tem um elemento só
            primeiro = null;
            ultimo = null;
        }
        else {
            No runner = primeiro;
            while (runner.getProximo() != ultimo) {//procuramos o penúltimo
                runner = runner.getProximo();
            }
            runner.setProximo(null);
            ultimo = runner;
        }
        return temp;
    }
}
