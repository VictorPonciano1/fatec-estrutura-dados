import java.util.Random;

public class NossoVetor {
    private int ocupacao;
    private int[] vetor;

    public NossoVetor(int tamanho) {
        vetor = new int[tamanho];
        ocupacao = 0;
    }

    public NossoVetor() {
        this(10);
    }

    // public NossoVetor(int tamanho, int ocupacao) {
    // this(tamanho);
    // this.ocupacao = ocupacao;
    // }
    // public boolean inserir (int elemento) {
    // if (!estaCheio()) {
    // vetor[ocupacao++] = elemento;
    // return true;
    // }
    // return false;
    // }
    public void inserir(int elemento) {
        if (estaCheio())
            redimensiona(vetor.length * 2);
        vetor[ocupacao++] = elemento;
    }

    public int remove() {
        if (estaVazio()) {
            throw new VetorVazioException("vetor vazio, nao ha o que remover");
        }
        int aux = vetor[--ocupacao];
        if (vetor.length >= 6 && ocupacao <= vetor.length / 4)
            redimensiona(vetor.length / 2);
        return aux;
    }

    public boolean estaCheio() {
        return ocupacao == vetor.length;
    }

    public boolean estaVazio() {
        return ocupacao == 0;
    }

    @Override
    public String toString() {
        String s = "ocupacao = " + ocupacao + "\n";
        for (int i = 0; i < ocupacao; i++)
            s += vetor[i] + " ";
        return s + "\n";
    }

    // void dobraVetor() {
    // int[] temp = new int[vetor.length * 2];
    // for (int i=0; i<ocupacao; i++)
    // temp[i] = vetor[i];
    // vetor = temp;
    // }
    // void divideMetade() {
    // int[] temp = new int[vetor.length / 2];
    // for (int i=0; i<ocupacao; i++)
    // temp[i] = vetor[i];
    // vetor = temp;
    // }
    void redimensiona(int tamanhoNovo) {
        int[] temp = new int[tamanhoNovo];
        for (int i = 0; i < ocupacao; i++)
            temp[i] = vetor[i];
        vetor = temp;
    }

    public int getTamanho() {
        return vetor.length;
    }

    public boolean contem(int elemento) {
        for (int i = 0; i < ocupacao; i++) {
            if (vetor[i] == elemento) {
                return true;
            }
        }
        return false;
    }

    // public int indiceDe (int elemento) {
    // for (int i = 0; i < ocupacao; i++) {
    // if (vetor[i] == elemento) {
    // return i;
    // }
    // }
    // return -1;
    // }
    public int indiceDe(int elemento) {
        if (estaVazio())
            throw new VetorVazioException("vetor esta vazio");
        for (int i = 0; i < ocupacao; i++) {
            if (vetor[i] == elemento)
                return i;
        }
        throw new ElementoNaoEncontradoException("elemento nao encontrado");
    }

    public void preencheVetor() {
        Random random = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(vetor.length * 10);
            // ocupacao++;
        }
        ocupacao = vetor.length;
    }

    public void bubbleSort() {
        for (int i = 1; i < vetor.length; i++)
            for (int j = 0; j < vetor.length - i; j++)
                if (vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
    }

    public void insertionSort() {
        for (int j = 1; j < vetor.length; ++j) {
            int x = vetor[j];
            int i;
            for (i = j - 1; i >= 0 && vetor[i] > x; --i)
                vetor[i + 1] = vetor[i];
            vetor[i + 1] = x;
        }
    }
    private int partition(int p, int r) { 
        int x = vetor[r];     /* o pivô é o último elemento da partição considerada do vetor */
        int i = p-1;
        for(int j=p; j<r; j++)
            if (vetor[j] <= x) {
                i = i + 1;
                int aux = vetor[i];
                vetor[i] = vetor[j]; 
                vetor[j] = aux;
            }
        i = i + 1;
        int aux = vetor[r]; 
        vetor[r] = vetor[i]; 
        vetor[i] = aux;
        return i;
    }
    public void quickSort(int p, int r) {
        if (p < r ) { 
            int q = partition(p, r);
            quickSort(p, q-1);
            quickSort(q+1, r);
        }
    }
}

class VetorVazioException extends RuntimeException {
    public VetorVazioException(String msg) {
        super(msg);
    }
}

class ElementoNaoEncontradoException extends RuntimeException {
    public ElementoNaoEncontradoException(String msg) {
        super(msg);
    }
}