package ListaEncadeada;

import java.util.Random;

public class Inversao 
{
    public static void main(String[] args) 
    {
        ListaLigada l1 = new ListaLigada();
        ListaLigada auxL = new ListaLigada();
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            l1.insereFim(random.nextInt(0,10));
        }
        System.out.println(l1);


        int size = l1.length();
        for (int i = 0; i < size; i++) {
            auxL.insereInicio(l1.removeFim());
        }
        

        for (int i = 0; i < 6; i++) {
            l1.insereInicio(auxL.removeInicio());
        }

        System.out.println(l1);
    }
}