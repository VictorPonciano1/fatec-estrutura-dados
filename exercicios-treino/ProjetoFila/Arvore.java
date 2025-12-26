package ArvoreBinaria;

public class Arvore 
{
    private Pessoa raiz;

    public void insere(Pessoa novo)
    {
        if(raizVazia())
            raiz = novo;

        else
            insereRec(novo, raiz);
    }
    private void insereRec(Pessoa novo, Pessoa atual) 
    {
        if(novo != null)
        {
            if(novo.getId() > atual.getId()) // Vai para a direita
            {
                if(atual.getDireita() == null)  
                    atual.setDireita(novo); // Se não tem nada na direita -> add
            
                else
                    insereRec(novo, atual.getDireita()); // Como ñ é null -> Verifica a partir do novo ponto
            }

            else // Vai para a esquerda
            {
                if(atual.getEsquerda() == null)
                    atual.setEsquerda(novo);
            
                else
                    insereRec(novo, atual.getEsquerda());
            }
        }
    }


    public int altura()
    {
        if( raizVazia() || raiz.getEsquerda() == null && raiz.getDireita() == null) return 0;

        return alturaRec(raiz);
    }
    private int alturaRec(Pessoa atual) 
    {
        if(atual == null || atual.getDireita() == null && atual.getEsquerda() == null) return 0;

        int alturaEsq = alturaRec(atual.getEsquerda());
        int alturaDir = alturaRec(atual.getDireita());

        return  alturaDir > alturaEsq  ?  ++alturaDir : ++alturaEsq;
    }


    public int contaNos()
    {
        if(raizVazia()) return 0;

        return contaNosRec(raiz);
    }
    private int contaNosRec(Pessoa atual) 
    {
        if(atual == null) return 0;

        return contaNosRec(atual.getEsquerda())  +  1  + contaNosRec(atual.getDireita());
    }

    public boolean isItemInTree(int itemBuscado)
    {
        if(raizVazia()) return false;

        return isItemInTreeRec(itemBuscado, raiz);
    }
    private boolean isItemInTreeRec(int pessoaBuscado, Pessoa atual) 
    {
        if(atual == null) return false;
        if(atual.getId() == pessoaBuscado) return true;


        if(pessoaBuscado > atual.getId())
            return isItemInTreeRec(pessoaBuscado, atual.getDireita());

        return isItemInTreeRec(pessoaBuscado, atual.getEsquerda());
    }


    /*public int biggestElement()
    {
        if(raizVazia()) throw new RuntimeException("Arvore vazia");
        
        No atual = raiz;
        while (atual.getDireita() != null) {
            atual = atual.getDireita();
        }

        return atual.getInfo();
    }*/


    @Override
    public String toString()
    {
        if(raizVazia())
            return "arvore vazia";
        
        return toStringRec(raiz);
    }
    private String toStringRec(Pessoa atual) //Aqui é como se fosse um caracol, quando uma execução termina, ela manda o resultado pra chamada anterior, 
    {                                    //logo é como se o metodo se desenrolasse
        if(atual == null)
            return "";
        
        String s = "";

        s += toStringRec(atual.getEsquerda());
        s += atual.getId() + " "; 
        s += toStringRec(atual.getDireita());

        return s;
    }


    public boolean raizVazia(){
        return raiz == null;
    }
}