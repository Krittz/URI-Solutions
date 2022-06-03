import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner inp = new Scanner(System.in);
        
        int num1 = inp.nextInt();
        int num2 = inp.nextInt();
        int num3 = inp.nextInt();
        

        if(num1 > num2 && num1>num3){
            System.out.printf("%d eh o maior\n", num1);
        }else if(num2 > num3){
            System.out.printf("%d eh o maior\n", num2);
        }else{
            System.out.printf("%d eh o maior\n", num3);
        }

        
        inp.close();
 
    }
 
}
