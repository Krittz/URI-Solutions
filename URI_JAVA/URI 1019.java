import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
            Scanner inp = new Scanner(System.in);
            int seg = inp.nextInt();

            int hora = seg / 3600;
            seg -= hora * 3600;

            int min = seg / 60;
            seg -= min * 60;

            int segundos = seg;
            

            System.out.printf("%d:%d:%d\n", hora, min, segundos);

        inp.close();
       
    }
 
}
