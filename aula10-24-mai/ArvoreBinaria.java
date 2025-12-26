public class ArvoreBinaria {
    
    private No raiz;

    public void insere(int info) {
        No novo = new No(info);

        if(raizVazia())
            raiz = novo;

        else
            insereRec(novo, raiz);
    }
    
    private void insereRec(No novo, No atual) {
        if(novo.getInfo() > atual.getInfo()) // Vai para a direita
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

    public int altura()
    {
        if( raizVazia() || raiz.getEsquerda() == null && raiz.getDireita() == null) return 0;

        return alturaRec(raiz);
    }
    private int alturaRec(No atual) 
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
    private int contaNosRec(No atual) 
    {
        if(atual == null) return 0;

        return contaNosRec(atual.getEsquerda())  +  1  + contaNosRec(atual.getDireita());
    }

    @Override
    public String toString()
    {
        if(raizVazia())
            return "arvore vazia";
        
        return toStringRec(raiz);
    }
    private String toStringRec(No atual) //Aqui é como se fosse um caracol, quando uma execução termina, ela manda o resultado pra chamada anterior, 
    {                                    //logo é como se o metodo se desenrolasse
        if(atual == null)
            return "";
        
        String s = "";

        s += toStringRec(atual.getEsquerda());
        s += atual.getInfo() + " "; 
        s += toStringRec(atual.getDireita());

        return s;
    }

    public boolean raizVazia(){
        return raiz == null;
    }

}