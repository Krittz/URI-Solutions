import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner inp = new Scanner(System.in);
        
        double value_a = inp.nextDouble();
        double value_b = inp.nextDouble();
        double value_c = inp.nextDouble();

        double delta = (value_b * value_b)- 4*value_a*value_c;

        if(value_a == 0|| delta < 0){

            System.out.println("Impossivel calcular");

        }else{        
             
        double bask_1 =((value_b * -1) +  Math.sqrt(delta)) / (2 *value_a);
        double bask_2 =((value_b * -1) -  Math.sqrt(delta)) / (2 *value_a);

        System.out.printf("R1 = %.5f\n", bask_1);
        System.out.printf("R2 = %.5f\n", bask_2);
        }
        inp.close();
 
    }
 
}
