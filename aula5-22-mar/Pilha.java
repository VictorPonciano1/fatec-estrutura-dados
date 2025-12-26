public class Pilha {

    Carta[] baralho;
    int topo;

    public Pilha () {
        baralho = new Carta[52];
        topo = 0;
    }

    public boolean isVazia() {
        return topo == 0;
    }

    public boolean isCheia() {
        return topo == baralho.length;
    }

    public boolean push (Carta c) {
        if (isCheia()) {
            return false;
        } else {
            baralho[topo++] = c;
            return true;
        }
    }

    public Carta pop () {
        if (isVazia()) {
            return null;
        } else {
            return baralho[--topo];
        }
    }

    @Override
    public String toString() {
        if (isVazia()) {
            return "mao vazia";
        } else {
            String s = "..............................\n";
            for (int i = topo - 1; i >= 0; i--) {
                s += baralho[i] + "\n";
            }
            return s + "..............................\n";
        }
    }

    //METODO ESPIA: DEVOLVE A CARTA NO TOPO
    public Carta espiaCarta() {
        if (isVazia()) {
            return null;
        } else {
            return baralho[topo-1];
        }
    }   

    //TAMANHO DA PILHA: DEVOLVE UM INTEIRO
    public int tamanho() {
        return topo;
    }

    public int search(Carta c) {
        for (int i = topo - 1, pos = 1; i >= 0; i--, pos++) {
            if (c.equals(baralho[i])) {
                return pos;
            } 
        }
        return -1;
    }


}
