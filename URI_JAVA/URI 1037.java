import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
                Scanner inp = new Scanner(System.in);
        
        float value_a = inp.nextFloat();

        if(value_a < 0 || value_a > 100){
            System.out.println("Fora de intervalo");
        }
        else if(value_a >= 0 && value_a <= 25){
            System.out.println("Intervalo [0,25]");
        }
        else if(value_a > 25 && value_a <= 50){
            System.out.println("Intervalo (25,50]");
        }
        else if(value_a > 50 && value_a <= 75){
            System.out.println("Intervalo (50,75]");
        }
        else if(value_a > 75 && value_a <= 100){
            System.out.println("Intervalo (75,100]");
        }
        
       
        inp.close();
        
    }
 
}
