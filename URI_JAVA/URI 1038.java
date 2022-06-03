import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 Scanner inp = new Scanner(System.in);
        
        double item_1 = 4.00;
        double item_2 = 4.50;
        double item_3 = 5.00;
        double item_4 = 2.00;
        double item_5 = 1.50;
        int item = inp.nextInt();
        int qnt = inp.nextInt();
        double result = 0;
        switch(item) {

            case 1:
               result =  qnt* item_1;
               System.out.printf("Total: R$ %.2f\n", result);
               break;

            case 2:
               result =  qnt* item_2;
               System.out.printf("Total: R$ %.2f\n", result);
               break;

            case 3:
               result =  qnt* item_3;
               System.out.printf("Total: R$ %.2f\n", result);
               break;

            case 4:
               result =  qnt* item_4;
               System.out.printf("Total: R$ %.2f\n", result);
               break;

            case 5:            
               result =  qnt* item_5;
               System.out.printf("Total: R$ %.2f\n", result);
               break;
            
            default:
                break;
        }       
               
        inp.close();
 
    }
 
}
