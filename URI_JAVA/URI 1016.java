import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
  
Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        int res = (60 * num) / 30;
        System.out.printf("%d minutos\n", res);
        
        
        inp.close();
  }
 
}
