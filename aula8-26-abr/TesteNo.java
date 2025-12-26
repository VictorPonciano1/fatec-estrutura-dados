public class TesteNo {
public static void main(String[] args) {
    
    No no1 = new No(10); //TRAZENDO (INSTANCIANDO) A CLASSE NÓ - NOVO OBJETO
    No no2 = new No(20); //TRAZENDO (INSTANCIANDO) A CLASSE NÓ - NOVO OBJETO

    no1.setProximo(no2);
    System.out.println(no1.getProximo().getInfo());

    no1.getProximo().setProximo(no1);
    System.out.println(no2.getProximo());
    }    
}
