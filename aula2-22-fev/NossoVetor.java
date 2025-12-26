public class NossoVetor {

    private int ocupacao;
    private int[] vetor;

    public NossoVetor (int tamanho) {
        vetor = new int[tamanho];
        ocupacao = 0;
    }

    public NossoVetor() {
        this(10);
    }

    // public NossoVetor(int tamanho, int ocupacao) {
    //     this(tamanho);
    //     this.ocupacao = ocupacao;
    // }

    public boolean Inserir(int elemento) {
        if (!estaCheio()) {
        vetor[ocupacao++] = elemento;
        // ocupacao++ - OUTRA OPCAO DE COMO FAZER;
        return true;
        }
        return false;
    }

    public boolean estaCheio() {
        return ocupacao == vetor.length;
    }

    // @Override

}