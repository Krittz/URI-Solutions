import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(System.in);
            
            double raio = inp.nextDouble();
            
            double res = (4/3.0) * 3.14159 *(raio * raio * raio);
            System.out.printf("VOLUME = %.3f\n", res);
            
            inp.close();
        
       
    }
 
}
