public class TesteCarta {
    public static void main(String[] args) {
        Carta c1 = new Carta("ouros", "sete");
        System.out.println("naipe de c1: " + c1.getNaipe());
        c1.setValor("dois");
        
        Pilha p = new Pilha();
        System.out.println("pilha instanciada:\n" + p);
        p.push(c1);
        System.out.println("empilhamos c1:\n" + p);

        p.push(new Carta("copas", "rainha"));
        System.out.println("empilhamos a rainha:\n" + p);

        System.out.println(p.pop() + " foi desempilhada");
        System.out.println(p);

        System.out.println(p.pop() + " foi desempilhada");
        System.out.println(p);

        Carta desempilhada = p.pop();
        if (desempilhada != null) {
            System.out.println(p.pop() + " foi desempilhada");
            System.out.println(p);
        }
        else {
            System.out.println("acabou o jogo");
        }
    }
}
