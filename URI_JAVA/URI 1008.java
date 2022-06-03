import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner inp = new Scanner(System.in);
    
        int num = inp.nextInt();
        int horas = inp.nextInt();
        double valor = inp.nextDouble();
        double salario = horas * valor;
        System.out.printf("NUMBER = %d\n", num);
        System.out.printf("SALARY = U$ %.2f\n", salario);
        
        inp.close();
    }
 
}
