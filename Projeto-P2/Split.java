package ListaEncadeada;

import java.util.Random;

public class Split 
{
    public static void main(String[] args) 
    {
        ListaLigada lPrime = new ListaLigada();
        ListaLigada l2 = new ListaLigada();
        ListaLigada l3 = new ListaLigada();
        Random random = new Random();   


        for (int i = 0; i < 6; i++) {
            lPrime.insereFim(random.nextInt(10,100));
        }
        System.out.println(lPrime);

        
        int size = lPrime.length() / 2;
        int startingPoint = 0;
        for (int i = 0; i < size; i++) 
        {
            No novo = new No(lPrime.removeInicio());
            l2.insereFim(novo.getInfo());
            startingPoint = novo.getPos();
        }
        System.out.println(l2);



        for (int i = startingPoint; i < size; i++) {
            l3.insereFim(lPrime.removeInicio());
        }
        System.out.println(l3);
    }
}