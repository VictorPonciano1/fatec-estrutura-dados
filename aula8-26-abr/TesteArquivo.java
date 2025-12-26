import java.util.Scanner;

public class TesteArquivo {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            int a = scanner.nextInt();
            String s = scanner.nextLine();
            System.out.println(a + " " + s);
        }

        scanner.close();
    
    }
}