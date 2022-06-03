import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner inp = new Scanner(System.in);
        int tempo = inp.nextInt();
        int vel = inp.nextInt();
        double result = (tempo*vel) / 12.0;
        System.out.printf("%.3f\n", result);
        inp.close();
    }
 
}
