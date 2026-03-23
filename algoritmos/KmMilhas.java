// resposta da professora
import java.util.Scanner;
public class KmMilhas{
public static void main (String[] args){
    //declara variaveis
Scanner scanner = new Scanner(System.in);

    double km, milhas;
   // entrada de de dados
    System.out.print ("digite os quilometros: ");
    km = scanner.nextDouble();
    //processamento
    milhas = km / 1.61;
    //saída
    System.out.printf("%2f Km correspondem a %.2f milhas\n", km,milhas);
    // libera o recurso do scanner
    scanner.close();

}

}