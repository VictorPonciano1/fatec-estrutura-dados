public class TesteModelo {
    public static void main(String[] args) {
     
        Modelo m = new Modelo();

        System.out.println("inteiro: " + m.inteiro);
        System.out.println("double: " + m.quebrado);
        System.out.println("string: " + m.linha);
        System.out.println("booleano: " + m.bool);
        System.out.println("char: " + m.c);
        System.out.println("m = " + m);
        
        
        Modelo m2 = new Modelo();
        System.out.println("m2 = " + m2);
    }
}