package ArvoreBinaria;

public class FilaLigada<T> 
{
    private NoFila<T> primeiro;
    private NoFila<T> ultimo;
    private int pos;
    
    public void enfileirar(T info)
    {
        NoFila<T> novo = new NoFila<>(info);

        if(filaVazia()){
            primeiro = novo;
        }
        else{
            ultimo.setProximo(novo);
        }
        ultimo = novo;
    }

    public T desenfileirar()
    {
        if(filaVazia()) return null;

        T temp = primeiro.getInfo();
        primeiro = primeiro.getProximo();

        if(primeiro == null){
            ultimo = null;
        }
        
        return temp;
    }

    public boolean filaVazia(){
        return primeiro == null;
    }

    @Override
    public String toString()
    {
        if(filaVazia()) return "fila vazia\n";

        NoFila<T> atual = primeiro;
        String s = "";

        while (atual != null) 
        {
            s += atual + " ";
            atual = atual.getProximo();
        }
        return s + "\n";
    }
}