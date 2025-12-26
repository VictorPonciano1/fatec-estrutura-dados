public class TesteFila {
    public static void main(String[] args) {
        
        Fila<Pessoa> fila = new Fila<>();
        fila.enfileira(new Pessoa("Rian", 2004));
        fila.enfileira(new Pessoa("Victor", 2005));
        fila.enfileira(new Pessoa("Edgar", 2006));
    
        System.out.println(fila);

        Pessoa pessoa = fila.desenfileira();
        if (pessoa != null) {
            System.out.println(pessoa.getNome() + " foi atendido no banco");
        } else {
            System.out.println("falha no desenfileiramento");
        }
        System.out.println(fila);

        while ((pessoa = fila.desenfileira()) != null) {
            System.out.println(pessoa.getNome() + " foi atendido no banco");
        }
        System.out.println(fila);
    }
}
