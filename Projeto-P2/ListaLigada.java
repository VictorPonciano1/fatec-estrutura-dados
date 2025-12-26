package ListaEncadeada;

public class ListaLigada 
{
    private No primeiro;
    private No ultimo;
    private int pos;

    public void insereInicio(int info)
    {
        No novo = new No(info);

        if(listaVazia()){
            ultimo = novo;
        }
        else
        {
            novo.setProximo(primeiro);
            primeiro.setAnterior(novo);
        }

        pos++;
        novo.setPos(pos);
        primeiro = novo;
        /*no final pq, se a lista já tiver itens e o primeiro = novo tiver no começo, 
        vai perder a referencia pro resto da lista*/
    }
    public int removeInicio()
    {
        if(listaVazia()) { 
            throw new RuntimeException("falha na remocao de inicio"); 
        }

        int aux = primeiro.getInfo();
        primeiro = primeiro.getProximo();


        

        if(primeiro == null){ //esvaziou a lista
            ultimo = null;
        } 

        return aux;
    }
    
    public void insereFim(int info)
    {
        No novo = new No(info);

        if(listaVazia()){
            primeiro = novo;
        }
        else
        {
            if(ultimo.getPos() == 1 && primeiro != ultimo)
            {
                No index = ultimo;
                while (index != null)
                {
                    index.setPos(index.getPos() + 1);
                    index = index.getAnterior();
                }
            }

            ultimo.setProximo(novo);
            novo.setAnterior(ultimo);
        }

        ultimo = novo;

        if(ultimo.getPos() == 2){ 
            novo.setPos(1);; 
        }
        else { 
            pos++; 
            novo.setPos(pos);
        }
    }
    public int removeFim()
    {
        if(listaVazia()){
            throw new RuntimeException("Falha na remocao do fim");
        }

        int aux = ultimo.getInfo();

        if(primeiro == ultimo) //só 1 elemento
        {
            primeiro = null;
            ultimo = null;
        }
        else
        {
            No index = primeiro;

            while (index.getProximo() != ultimo){ //procurando o penultimo
                index = index.getProximo();
            }

            index.setProximo(null);
            ultimo = index;
        }

        return aux;
    }

    public String removeElement(int elem)
    {
        int aux = 0;
        String removedElems = "|";

        if(primeiro == ultimo && primeiro.getInfo() == elem) //só 1 elemento
        {
            aux = primeiro.getInfo();
            removedElems += aux;
            primeiro = null;
            ultimo = null;
            
            return removedElems + "|";
        }

        if(primeiro.getInfo() == elem)
        {
            removedElems += removeInicio();
            return removedElems + "|";
        }
        else if(ultimo.getInfo() == elem)
        {
            removedElems += removeFim();
            return removedElems  + "|";
        }


        No index = primeiro.getProximo();
        while (index != null) // && aux == 0 se quiser pegar só a 1° ocorrencia
        {
            if(index.getInfo() == elem)
            {
                aux = index.getInfo();
                removedElems += aux + "|";

                index.getAnterior().setProximo(index.getProximo());
                index.getProximo().setAnterior(index.getAnterior());
            }

            index = index.getProximo();
        }

        return removedElems;
    }
    
    public void esvazioIterativo()
    {
        while (primeiro.getProximo() != null) 
        {
            primeiro = primeiro.getProximo();
        }
        primeiro = null;
    }

    public void esvazioEficiente()
    {
        primeiro = null;
        ultimo = null;
    }

    public int maiorElemento()
    {
        No index = primeiro;
        int maior = 0;

        while (index != null) 
        {
            if (maior < index.getInfo()){
                maior = index.getInfo();
            }

            index = index.getProximo();
        }

        return maior;
    }

    public boolean isElementInList(int elem)
    {
        No index = primeiro;
        boolean esta = false;

        while (index != null) 
        {
            if(index.getInfo() == elem){
                esta = true;
            }

            index = index.getProximo();
        }

        return esta;
    }

    public int repetitionNumber(int elem)
    {
        No index = primeiro;
        int cont = 0;

        while (index != null) 
        {
            if(index.getInfo() == elem){
                cont++;
            }

            index = index.getProximo();
        }

        return cont;
    }

    public int getPos() {
        return pos;
    }
    public int length()
    {
        if(listaVazia()) { return 0; }

        int cont = 0;
        No index = primeiro;

        while (index != null) 
        {
            cont++;
            index = index.getProximo();
        }

        return cont;
    }

    public boolean listaVazia() { return primeiro == null; }

    //o toString varre a lista do 1 -> final
    @Override
    public String toString()
    {
        if(listaVazia()) { return "lista vazia"; }

        String s = "";
        No index = primeiro;

        while (index != null) 
        {
            s += index + " -> ";
            index = index.getProximo();
        }

        return s + "\\\\";
    }
}