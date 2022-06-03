import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 Scanner inp = new Scanner(System.in);
        
        int value_a = inp.nextInt();
        int value_b = inp.nextInt();
        int value_c = inp.nextInt();
        int value_d = inp.nextInt();

        if(value_b > value_c && value_d > value_a && value_c + value_d > value_a + value_b && value_c >= 0 &&value_d>=0 && value_a % 2 == 0 ){
            System.out.println("Valores aceitos");
        }else{
            System.out.println("Valores nao aceitos");
        }
        
        inp.close();
    }
 
}
