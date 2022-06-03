import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();
        int d = inp.nextInt();
        
        int diferenca = (a * b) - (c * d);
        
        System.out.printf("DIFERENCA = %d\n", diferenca);
        
        inp.close();
 
    }
 
}
