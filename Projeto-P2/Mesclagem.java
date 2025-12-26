package ListaEncadeada;

import java.util.Random;

public class Mesclagem 
{
    public static void main(String[] args) 
    {
        ListaLigada l1 = new ListaLigada();
        ListaLigada l2 = new ListaLigada();
        ListaLigada l3 = new ListaLigada();
        Random random = new Random();    

        for (int i = 0; i < 6; i++) {
            l1.insereFim(random.nextInt(10,100));
        }
        System.out.println(l1);

        for (int i = 0; i < 6; i++) {
            l2.insereFim(random.nextInt(10,100));
        }
        System.out.println(l2);

        while (!l1.listaVazia()) {
            l3.insereFim(l1.removeInicio());
        }
        while (!l2.listaVazia()) {
            l3.insereFim(l2.removeInicio());
        }

        System.out.println(l3);
    }
}