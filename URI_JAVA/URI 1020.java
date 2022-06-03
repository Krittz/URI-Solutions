import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner inp = new Scanner(System.in);
        
        int entrada = inp.nextInt();
        int ano = entrada / 365;
        entrada -= (ano*365);

        int mes = entrada  / 30;
        entrada -= (mes * 30);
        
        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", ano, mes, entrada);
        
        inp.close();
    }
 
}
