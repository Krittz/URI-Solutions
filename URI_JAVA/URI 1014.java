import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner inp = new Scanner(System.in);
       
        int dist = inp.nextInt();
        double comb = inp.nextDouble();
        
        double res = dist / comb;
        System.out.printf("%.3f km/l\n", res);
        
        inp.close();
    }
 
}
