import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(System.in);
        
        int peca1 = inp.nextInt();
        int qnt1 = inp.nextInt();
        double valor1 = inp.nextDouble();
        int peca2 = inp.nextInt();
        int qnt2 = inp.nextInt();
        double valor2 = inp.nextDouble();
        double res = (valor1 * qnt1) + (valor2 * qnt2);
        
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", res);
        
        inp.close();
 
    }
 
}
