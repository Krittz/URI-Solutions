import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
          Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double triangulo = (a * c) /2;
        double circulo = (c * c) * 3.14159;
        double trapezio = ((a + b) * c )/2 ;
        double quadrado = (b *b);
        double retangulo = a * b;
        
        System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f\n", triangulo, circulo, trapezio, quadrado, retangulo);
    
        input.close();
    }
 
}
