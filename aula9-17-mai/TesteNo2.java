import java.math.BigInteger;

public class TesteNo2 {
    public static void main(String[] args) {
        No2<String> noS = new No2<>("Hello World");
        No2<Integer> noI = new No2<>(123456);
        No2<BigInteger> noB = new No2<>(new BigInteger("12345678910987654321"));
    
        System.err.println(noS);
        System.out.println(noI);   
        System.out.println(noB); 
    }
}
