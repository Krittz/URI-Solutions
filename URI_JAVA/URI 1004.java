import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int val1 = input.nextInt();
        int val2 = input.nextInt();
        int prod = val1 * val2;
        System.out.printf("PROD = %d\n", prod);
        input.close();
       
    }
 
}
