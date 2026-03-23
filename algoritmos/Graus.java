//Ler um ângulo em graus e apresentã-los convertido em radianos. A fórmula de conversão é R = G * r/180
// sendo o angulo em graus e R em radianos, usar a constante Math.PI.
import java.util.Scanner;
public class Graus {
    public static void main(String[] args){
 // declara variáveis
    Scanner scanner = new Scanner(System.in);
    double radianos, graus;
    System.out.print("digite o angulo em graus: ");
    graus = scanner.nextDouble();
    // processamento
    radianos= graus * Math.PI / 180;
    // saída

    System.out.println(graus + " \u00B0 = " + radianos + "rad" );
    System.out.printf (" %.2f\u00B0 = %.3f rad\n, graus, radianos");

    scanner.close();




    }

}