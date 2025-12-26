package ArvoreBinaria;

import java.util.Random;
import java.util.Scanner;

public class SistemaAtendimento 
{
    public static void main(String[] args) 
    {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        FilaLigada<Pessoa> fila = new FilaLigada<>();
        Arvore abb = new Arvore();
    
        String opcao = "";
        do 
        {
            System.out.println("a) Chegada de usuario");
            System.out.println("b) Atendimento de usuario");
            System.out.println("c) Status da fila");
            System.out.println("d) Relatorio de atendimentos");
            System.out.println("e) Alguem aguardando?");
            System.out.println("f) Sair");
            opcao = sc.nextLine().toLowerCase();

            switch (opcao) 
            {
                case "a":
                    addPessoa(random, fila, sc);
                    break;
        
                case "b":
                    praArvore(fila, abb);
                    break;
        
                case "c":
                    statusFila(fila);
                    break;
        
                case "d":
                      relatorio(abb);  
                    break;
        
                case "e":
                        
                    break;

                case "f":
                        
                    break;
                
                default:
                    System.out.println("opcao invalida");
                    break;
            }
        } 
        while (!opcao.equals("f"));

        
        sc.close();
    }

    static void addPessoa(Random random, FilaLigada<Pessoa> fila, Scanner sc)
    {
        System.out.print("Quantas pessoas na fila? ");
        int quant = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < quant; i++) 
        {
            System.out.print("Nome: ");
            Pessoa pessoa = new Pessoa(sc.nextLine(), random.nextInt(100,1000));
            fila.enfileirar(pessoa);
        }
    }

    static void praArvore(FilaLigada<Pessoa> fila, Arvore arv){
        arv.insere(fila.desenfileirar());
    }

    static void statusFila(FilaLigada<Pessoa> fila){
        System.out.println(fila);
    }

    static void relatorio(Arvore arv){
        System.out.println(arv);
    }

    /*static String aguardando_Atendida(Arvore arv, Pessoa pessoa)
    {
        if(arv.raizVazia()) return "essa pessoa nao esta na fila";

        else
        {
            if(pessoa == null) return "essa pessoa nao esta na fila";

            if(pessoa.getId() == pessoa.getId()) return pessoa.getNome();


            if(pessoaBuscado > atual.getId())
                return isItemInTreeRec(pessoaBuscado, atual.getDireita());

            return isItemInTreeRec(pessoaBuscado, atual.getEsquerda());
        }
    }*/
}