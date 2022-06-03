import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner inp = new Scanner(System.in);
        String nome = inp.nextLine();
        double fixo = inp.nextDouble();
        double vendas= inp.nextDouble();
        double res= fixo +(vendas * 0.15);
        System.out.printf("TOTAL = R$ %.2f\n",res );
        
        inp.close();
 
    }
 
}
