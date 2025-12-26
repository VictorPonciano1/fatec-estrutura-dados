public class Pilha {
    private Carro[] elementos;
    private int topo;

    public Pilha(int capacidade) {
        elementos = new Carro[capacidade];
        topo = 0;
    }

    public boolean isVazia() {
        return topo == 0;
    }

    public boolean isCheia() {
        return topo == elementos.length;
    }

    public boolean push(Carro item) {
        if (isCheia()) {
            return false;
        } else {
            elementos[topo++] = item;
            return true;
        }
    }

    public Carro pop() {
        if (isVazia()) {
            return null;
        } else {
            return elementos[--topo];
        }
    }

    public Carro peek() {
        if (isVazia()) {
            return null;
        } else {
            return elementos[topo - 1];
        }
    }

    public int tamanho() {
        return topo;
    }

    public boolean contains(String placa) {
        for (int i = 0; i < topo; i++) {
            if (elementos[i].getPlaca().equalsIgnoreCase(placa)) {
                return true;
            }
        }
        return false;
    }
}
