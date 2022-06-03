import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(System.in);
        
        double item_x = inp.nextDouble();
        double item_y = inp.nextDouble();

        if(item_x == 0 && item_y == 0){
           System.out.println("Origem");

        }else if((item_x == 0 && item_y < 0) || (item_x == 0 && item_y > 0)){
           System.out.println("Eixo Y");

        }else if((item_x < 0 && item_y == 0) || (item_y == 0 && item_x > 0)){
           System.out.println("Eixo X");

        }else if(item_x > 0 && item_y > 0){
           System.out.println("Q1");

        }else if(item_x < 0 && item_y > 0){
           System.out.println("Q2");

        }else if(item_x < 0 && item_y < 0){
           System.out.println("Q3");

        }else if(item_x > 0 && item_y < 0){
           System.out.println("Q4");
        }

    inp.close();
        
 
    }
 
}
