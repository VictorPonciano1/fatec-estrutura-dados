public class Fila<T> {
    private No2<T> primeiro;
    private No2<T> ultimo;

    // CONSTRUTOR PADRÃO
    public boolean filaVazia() {
        return primeiro == null;
    }

    public void enfileira (T info) {
        No2<T> novo = new No2<>(info);
        if (filaVazia()) {
            primeiro = novo;
        } else {
            ultimo.setProximo(novo);
        }
        ultimo = novo;
    }

    public T desenfileira () {
        if (filaVazia()) return null;
        T temp = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        if (primeiro == null) { // VERIFICA SE A LISTA ESTA VAZIA
            ultimo = null;
        }
        return temp;
    }

    @Override
    public String toString () {
        if (filaVazia()) return "fila vazia\n";
        No2<T> atual = primeiro;
        String s = "";
        while (atual != null) {
            s += atual;
            atual = atual.getProximo();
        }
        return s + "\n";
    }
}
