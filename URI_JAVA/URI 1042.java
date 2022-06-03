import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
         Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if(num1 < num2 && num1 < num3){
            if(num2 < num3){
                System.out.printf("%d\n%d\n%d\n", num1, num2, num3);
            }else{
                System.out.printf("%d\n%d\n%d\n", num1, num3, num2);
            }

        }else if(num2 < num1 && num2 < num3){
            if(num1 < num3){
                System.out.printf("%d\n%d\n%d\n", num2, num1, num3);
            }else{
                System.out.printf("%d\n%d\n%d\n", num2, num3, num1);
            }
        }else if(num3 < num1 && num3 < num2){
            if(num1 < num2){
                System.out.printf("%d\n%d\n%d\n", num3, num1, num2);
            }else{
                System.out.printf("%d\n%d\n%d\n", num3, num2, num1);
            }
        }
        System.out.printf("\n%d\n%d\n%d\n", num1, num2, num3);


        
        sc.close();
 
    }
 
}
