public class Main {

    public static void main(String[] args) {
        Vetor v1;
        if (condition) {
            v1 = new Vetor(5);
        }
        else {
            v1 = new Vetor(10);
        }
    }
}

class Vetor {
    private int ocupacao;
    private int[] v;
    public Vetor (int tamanho) {
        v = new int[tamanho];
        ocupacao = 0; //legibilidade
    }
}