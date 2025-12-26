package ArvoreBinaria;

public class Pessoa 
{
    String nome;
    int id;
    private Pessoa aEsquerda;
    private Pessoa aDireita;
    
    public Pessoa(String nome, int id) 
    {
        this.nome = nome;
        this.id = id;
    }

    

    public Pessoa(int id) {
        this.id = id;
    }


    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}


    public Pessoa getEsquerda() {return aEsquerda;}
    public void setEsquerda(Pessoa aEsquerda) {this.aEsquerda = aEsquerda;}


    public Pessoa getDireita() {return aDireita;}
    public void setDireita(Pessoa aDireita) {this.aDireita = aDireita;}


    @Override
    public String toString() {
        return "Nome: " + nome + ", id: " + id;
    }
}