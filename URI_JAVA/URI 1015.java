import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner inp = new Scanner(System.in);
        double p1 = inp.nextDouble();
        double p2 = inp.nextDouble();
        double x1 = inp.nextDouble();
        double x2 = inp.nextDouble();
        double res = Math.pow((p1 - x1), 2) + Math.pow((p2 - x2), 2) ;
        res = Math.sqrt(res);
        System.out.printf("%.4f\n",res);
       

        inp.close();
 
    }
 
}
